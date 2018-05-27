package com.cloak.serivce.stock.fundmental;

import com.cloak.fundmental.StockGrowth;
import java.util.List;

public interface StockGrowthService {
    /**
     * 根据股票代码年份及第几季度查询其所有的成长能力历史数据
     * @param stockno
     * @param year
     * @param quarter
     * @return
     */
    List<StockGrowth> findAll(String stockno, int year, int quarter);
}
