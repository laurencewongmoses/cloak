package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossGDPForService;
import com.cloak.stockgross.GrossGDPFor;
import com.cloak.stockgross.dao.GrossGDPForDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross.impl
 * @ClassName: GrossGDPForServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossGDPForServiceImpl implements GrossGDPForService{
    @Autowired
    GrossGDPForDao dao;

    @Override
    public List<GrossGDPFor> findAll() {
        return dao.findAll();
    }
}
