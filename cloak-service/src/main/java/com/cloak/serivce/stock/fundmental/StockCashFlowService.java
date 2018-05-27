package com.cloak.serivce.stock.fundmental;


import com.cloak.fundmental.StockCashFlow;

import java.util.List;

public interface StockCashFlowService {
    /**
     * 根据股票代码年份及第几季度查询其所有的现金流历史数据
     * @param stockno
     * @param year
     * @param quarter
     * @return
     */
    List<StockCashFlow> findAll(String stockno, int year, int quarter);
}
