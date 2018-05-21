package com.cloak.serivce.stock;

import com.cloak.stock.base.BaseStockHistory;
import java.util.List;

public interface BaseHistoryService {
    List<BaseStockHistory> findAll(String stockno);
}
