package com.cloak.fundmental.dao;

import com.cloak.fundmental.StockDebtpaying;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: StockCashFlowDao
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/24 下午3:34
 */
public interface StockDebtpayingDao {
    List<StockDebtpaying> findByStockNo(@Param("tablename")String tablename,@Param("stockno")String stockno);
    String selectTableName(String tablename);
}
