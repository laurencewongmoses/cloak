package com.cloak.serivce.stock;

import com.cloak.stock.base.BaseStockHistory;
import java.util.List;

public interface BaseHistoryService {
    /**
     * 根据股票代码查询其所有的历史数据
     * @param stockno
     * @return
     */
    List<BaseStockHistory> findAll(String stockno);
}
