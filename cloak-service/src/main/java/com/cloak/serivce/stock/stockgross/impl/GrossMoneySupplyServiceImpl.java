package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossMoneySupplyService;
import com.cloak.stockgross.GrossMoneySupply;
import com.cloak.stockgross.dao.GrossMoneySupplyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross.impl
 * @ClassName: GrossMoneySupplyServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossMoneySupplyServiceImpl implements GrossMoneySupplyService{
    @Autowired
    GrossMoneySupplyDao dao;

    @Override
    public List<GrossMoneySupply> findAll() {
        return dao.findAll();
    }
}
