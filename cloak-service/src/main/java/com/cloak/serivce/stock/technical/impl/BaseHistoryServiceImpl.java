package com.cloak.serivce.stock.technical.impl;

import com.cloak.constants.Constant;
import com.cloak.serivce.conf.RedisBean;
import com.cloak.serivce.stock.technical.BaseHistoryService;
import com.cloak.technical.base.BaseStockHistory;
import com.cloak.technical.dao.BaseHistoryDao;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class BaseHistoryServiceImpl implements BaseHistoryService {

    @Autowired
    private RedisBean redisBean;

    @Autowired
    private BaseHistoryDao baseHistoryDao;

    /**
     * 根据代码查询其所有历史数据,当表不存在时返回空数据
     * @param stockno
     * @return
     */
    @Override
    public List<BaseStockHistory> findAll(String stockno) {
        List<BaseStockHistory> ret ;
        StringBuffer tableName = new StringBuffer(Constant.STOCK_HISTORY_PREX);
        tableName.append(stockno);

        Object list = redisBean.getObject(tableName.toString());
        if(list != null){
            ret = new Gson().fromJson(list.toString(),new TypeToken<List<BaseStockHistory>>(){}.getType());
            return ret;
        }

        //当表不存在时返回空的链表
        String isTableName = baseHistoryDao.selectTableName(tableName.toString());
        if(isTableName == null)
            return new ArrayList<>();
        else{
            ret = baseHistoryDao.findByTableName(tableName.toString());
            redisBean.setRedisValue(tableName.toString(),ret,Constant.REDIS_TIMEOUT_MIN, TimeUnit.MINUTES);
            return ret;
        }
    }


}
