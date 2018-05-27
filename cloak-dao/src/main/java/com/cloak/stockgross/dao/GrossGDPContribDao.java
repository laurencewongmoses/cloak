package com.cloak.stockgross.dao;

import com.cloak.stockgross.GrossGDPContrib;

import java.util.List;

/**
 * @PackageName: com.cloak.stockgross.dao
 * @ClassName: GrossGDPContribDao
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26 上午9:19
 */
public interface GrossGDPContribDao {
    List<GrossGDPContrib> findAll();
}
