package com.cloak.serivce.stock.fundmental.impl;
import com.cloak.constants.Constant;
import com.cloak.fundmental.StockInfo;
import com.cloak.fundmental.dao.StockInfoDao;
import com.cloak.serivce.conf.RedisBean;
import com.cloak.serivce.stock.fundmental.StockInfoService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @PackageName: com.cloak.serivce.stock.fundmental.impl
 * @ClassName: StockInfoServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/25
 */
@Service
public class StockInfoServiceImpl implements StockInfoService {
    @Autowired
    StockInfoDao dao;

    @Autowired
    RedisBean redisBean;

    @Override
    public List<StockInfo> findStock(String stockno) {
        List<StockInfo> ret ;
        String tableName = Constant.STOCK_LIST_TABLE;

        String redisKey = tableName+"_"+stockno;

        Object list = redisBean.getObject(redisKey);
        if(list != null){
            ret = new Gson().fromJson(list.toString(),new TypeToken<List<StockInfo>>(){}.getType());
            return ret;
        }

        //当表不存在时返回空的链表
        String isTableName = dao.selectTableName(tableName);
        if(isTableName == null)
            return new ArrayList<>();
        else{
            ret = dao.findByStockNo(tableName,stockno);
            if(ret != null && ret.size()>0)
                redisBean.setRedisValue(redisKey,ret,Constant.REDIS_TIMEOUT_MIN, TimeUnit.MINUTES);
            return ret;
        }
    }


    public List<StockInfo> findAll(){
        List<StockInfo> ret ;
        String tableName = Constant.STOCK_LIST_TABLE;

        Object list = redisBean.getObject(tableName);
        if(list != null){
            ret = new Gson().fromJson(list.toString(),new TypeToken<List<StockInfo>>(){}.getType());
            return ret;
        }

        //当表不存在时返回空的链表
        String isTableName = dao.selectTableName(tableName);
        if(isTableName == null)
            return new ArrayList<>();
        else{
            ret = dao.findAll(tableName);
            if(ret != null && ret.size()>0)
                redisBean.setRedisValue(tableName,ret,Constant.REDIS_TIMEOUT_MIN, TimeUnit.MINUTES);
            return ret;
        }
    }
}
