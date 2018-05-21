package com.cloak.history.dao;

import com.cloak.stock.base.BaseStockHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @PackageName: com.cloak.history.dao
 * @ClassName: BaseHistoryDao
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/21 下午8:04
 */
public interface BaseHistoryDao {
    List<BaseStockHistory> findByTableName(@Param("tablename")String tablename);
    String selectTableName(String tablename);
}
