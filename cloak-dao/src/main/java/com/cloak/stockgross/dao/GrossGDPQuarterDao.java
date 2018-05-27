package com.cloak.stockgross.dao;

import com.cloak.stockgross.GrossGDPQuarter;

import java.util.List;

/**
 * @PackageName: com.cloak.stockgross.dao
 * @ClassName: GrossGDPQuarterDao
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26 上午9:22
 */
public interface GrossGDPQuarterDao {
    List<GrossGDPQuarter> findAll();
}
