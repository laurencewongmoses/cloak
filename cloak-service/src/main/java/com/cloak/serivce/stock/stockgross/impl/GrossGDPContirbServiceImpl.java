package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossGDPContirbService;
import com.cloak.stockgross.GrossGDPContrib;
import com.cloak.stockgross.dao.GrossGDPContribDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross.impl
 * @ClassName: GrossGDPContirbServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossGDPContirbServiceImpl implements GrossGDPContirbService{
    @Autowired
    GrossGDPContribDao dao;

    @Override
    public List<GrossGDPContrib> findAll() {
        return dao.findAll();
    }
}
