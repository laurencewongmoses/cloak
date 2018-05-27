package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossRRRService;
import com.cloak.stockgross.GrossRRR;
import com.cloak.stockgross.dao.GrossRRRDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross.impl
 * @ClassName: GrossRRRServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossRRRServiceImpl implements GrossRRRService{
    @Autowired
    GrossRRRDao dao;

    @Override
    public List<GrossRRR> findAll() {
        return dao.findAll();
    }
}
