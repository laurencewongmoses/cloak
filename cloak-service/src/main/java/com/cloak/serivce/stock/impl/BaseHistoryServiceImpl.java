package com.cloak.serivce.stock.impl;

import com.cloak.constants.Constant;
import com.cloak.serivce.stock.BaseHistoryService;
import com.cloak.stock.base.BaseStockHistory;
import com.cloak.history.dao.BaseHistoryDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BaseHistoryServiceImpl implements BaseHistoryService {

    @Autowired
    private BaseHistoryDao baseHistoryDao;

    /**
     * 根据代码查询其所有历史数据,当表不存在时返回空数据
     * @param stockno
     * @return
     */
    @Override
    public List<BaseStockHistory> findAll(String stockno) {
        StringBuffer tableName = new StringBuffer(Constant.STOCK_HISTORY_PREX);
        tableName.append(stockno);
        //当表不存在时返回空的链表
        String isTableName = baseHistoryDao.selectTableName(tableName.toString());
        if(isTableName == null)
            return new ArrayList<>();
        else
            return baseHistoryDao.findByTableName(tableName.toString());
    }
}
