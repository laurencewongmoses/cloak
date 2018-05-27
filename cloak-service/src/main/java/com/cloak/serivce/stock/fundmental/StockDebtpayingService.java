package com.cloak.serivce.stock.fundmental;

import com.cloak.fundmental.StockDebtpaying;

import java.util.List;

public interface StockDebtpayingService {
    /**
     * 根据股票代码年份及第几季度查询其所有的偿债能力历史数据
     * @param stockno
     * @param year
     * @param quarter
     * @return
     */
    List<StockDebtpaying> findAll(String stockno,int year,int quarter);
}
