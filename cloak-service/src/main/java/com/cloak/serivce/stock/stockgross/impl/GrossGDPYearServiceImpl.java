package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossGDPYearService;
import com.cloak.stockgross.GrossGDPYear;
import com.cloak.stockgross.dao.GrossGDPYearDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross.impl
 * @ClassName: GrossGDPYearServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossGDPYearServiceImpl implements GrossGDPYearService{
    @Autowired
    GrossGDPYearDao dao;

    @Override
    public List<GrossGDPYear> findAll() {
        return dao.findAll();
    }
}
