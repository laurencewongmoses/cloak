package com.cloak.serivce.stock.fundmental;

import com.cloak.fundmental.StockInfo;

import java.util.List;

public interface StockInfoService {
    /**
     * 根据股票代码年份及第几季度查询其所有的历史数据
     * @param stockno
     * @return
     */
    List<StockInfo> findStock(String stockno);

    /**
     * 查找全部股票信息
     * @return
     */
    List<StockInfo> findAll();
}
