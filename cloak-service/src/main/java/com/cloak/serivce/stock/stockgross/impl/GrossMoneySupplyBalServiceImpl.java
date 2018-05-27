package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossMoneySupplyBalService;
import com.cloak.stockgross.GrossMoneySupplyBal;
import com.cloak.stockgross.dao.GrossMoneySupplyBalDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross.impl
 * @ClassName: GrossMoneySupplyBalServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossMoneySupplyBalServiceImpl implements GrossMoneySupplyBalService{
    @Autowired
    GrossMoneySupplyBalDao dao;

    @Override
    public List<GrossMoneySupplyBal> findAll() {
        return dao.findAll();
    }
}
