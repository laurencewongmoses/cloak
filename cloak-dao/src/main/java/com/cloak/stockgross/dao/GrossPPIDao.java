package com.cloak.stockgross.dao;

import com.cloak.stockgross.GrossPPI;

import java.util.List;

/**
 * @PackageName: com.cloak.stockgross.dao
 * @ClassName: GrossPPIDao
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26 上午9:23
 */
public interface GrossPPIDao {
    List<GrossPPI> findAll();
}
