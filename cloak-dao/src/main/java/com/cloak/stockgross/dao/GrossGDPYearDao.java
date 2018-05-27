package com.cloak.stockgross.dao;

import com.cloak.stockgross.GrossGDPYear;

import java.util.List;

/**
 * @PackageName: com.cloak.stockgross.dao
 * @ClassName: GrossGDPYearDao
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26 上午9:22
 */
public interface GrossGDPYearDao {
    List<GrossGDPYear> findAll();
}
