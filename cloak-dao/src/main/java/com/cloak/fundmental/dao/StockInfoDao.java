package com.cloak.fundmental.dao;

import com.cloak.fundmental.StockInfo;
import com.cloak.fundmental.StockReport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: StockCashFlowDao
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/24 下午3:34
 */
public interface StockInfoDao {
    List<StockInfo> findByStockNo(@Param("tablename") String tablename, @Param("stockno") String stockno);
    List<StockInfo> findAll(@Param("tablename") String tablename);
    String selectTableName(String tablename);
}
