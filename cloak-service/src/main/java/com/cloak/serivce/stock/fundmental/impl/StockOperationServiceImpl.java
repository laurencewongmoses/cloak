package com.cloak.serivce.stock.fundmental.impl;

import com.cloak.constants.Constant;
import com.cloak.fundmental.StockOperation;
import com.cloak.fundmental.dao.StockOperationDao;
import com.cloak.serivce.conf.RedisBean;
import com.cloak.serivce.stock.fundmental.StockOperationService;
import com.cloak.serivce.utils.QuarterUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @PackageName: com.cloak.serivce.stock.fundmental.impl
 * @ClassName: StockOperationServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/25
 */
@Service
public class StockOperationServiceImpl implements StockOperationService{
    @Autowired
    StockOperationDao dao;

    @Autowired
    RedisBean redisBean;

    @Override
    public List<StockOperation> findAll(String stockno, int year, int quarter) {
        List<StockOperation> ret ;
        StringBuffer tableName = new StringBuffer(Constant.STOCK_OPERATION_PREX);
        tableName.append(year).append("_");
        tableName.append(QuarterUtil.quarterStr(quarter));

        String redisKey = tableName.toString()+"_"+stockno;

        Object list = redisBean.getObject(redisKey);
        if(list != null){
            ret = new Gson().fromJson(list.toString(),new TypeToken<List<StockOperation>>(){}.getType());
            return ret;
        }

        //当表不存在时返回空的链表
        String isTableName = dao.selectTableName(tableName.toString());
        if(isTableName == null)
            return new ArrayList<>();
        else{
            ret = dao.findByStockNo(tableName.toString(),stockno);
            if(ret != null && ret.size()>0)
                redisBean.setRedisValue(redisKey,ret,Constant.REDIS_TIMEOUT_MIN, TimeUnit.MINUTES);
            return ret;
        }
    }
}
