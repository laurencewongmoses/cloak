package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossCPIService;
import com.cloak.stockgross.GrossCPI;
import com.cloak.stockgross.dao.GrossCPIDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross.impl
 * @ClassName: GrossCPIServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossCPIServiceImpl implements GrossCPIService{
    @Autowired
    GrossCPIDao dao;

    @Override
    public List<GrossCPI> findAll() {
        return dao.findAll();
    }
}
