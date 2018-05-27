package com.cloak.serivce.stock.fundmental;

import com.cloak.fundmental.StockReport;

import java.util.List;

public interface StockReportService {
    /**
     * 根据股票代码年份及第几季度查询其所有的历史数据
     * @param stockno
     * @param year
     * @param quarter
     * @return
     */
    List<StockReport> findAll(String stockno, int year, int quarter);
}
