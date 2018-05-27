package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossGDPPullService;
import com.cloak.stockgross.GrossGDPPull;
import com.cloak.stockgross.dao.GrossGDPPullDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross.impl
 * @ClassName: GrossGDPPullServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossGDPPullServiceImpl implements GrossGDPPullService{
    @Autowired
    GrossGDPPullDao dao;

    @Override
    public List<GrossGDPPull> findAll() {
        return dao.findAll();
    }
}
