package com.cloak.history.dao;

import com.cloak.stock.base.BaseStockHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseHistoryDao {
    List<BaseStockHistory> findByTableName(@Param("tablename")String tablename);
    String selectTableName(String tablename);
}
