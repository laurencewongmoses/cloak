package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossPPIService;
import com.cloak.stockgross.GrossPPI;
import com.cloak.stockgross.dao.GrossPPIDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross.impl
 * @ClassName: GrossPPIServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossPPIServiceImpl implements GrossPPIService{
    @Autowired
    GrossPPIDao dao;

    @Override
    public List<GrossPPI> findAll() {
        return dao.findAll();
    }
}
