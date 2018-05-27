package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossGDPQuarterService;
import com.cloak.stockgross.GrossGDPQuarter;
import com.cloak.stockgross.dao.GrossGDPQuarterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross
 * @ClassName: GrossGDPQuarterServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossGDPQuarterServiceImpl implements GrossGDPQuarterService{
    @Autowired
    GrossGDPQuarterDao dao;

    @Override
    public List<GrossGDPQuarter> findAll() {
        return dao.findAll();
    }
}
