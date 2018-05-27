package com.cloak.stockgross.dao;

import com.cloak.stockgross.GrossGDPPull;

import java.util.List;

/**
 * @PackageName: com.cloak.stockgross.dao
 * @ClassName: GrossGDPPullDao
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26 上午9:19
 */
public interface GrossGDPPullDao {
    List<GrossGDPPull> findAll();
}
