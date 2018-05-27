package com.cloak.serivce.stock.stockgross.impl;

import com.cloak.serivce.stock.stockgross.GrossLoanRateService;
import com.cloak.stockgross.GrossLoanRate;
import com.cloak.stockgross.dao.GrossLoanRateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross.impl
 * @ClassName: GrossLoanRateServiceImpl
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Service
public class GrossLoanRateServiceImpl implements GrossLoanRateService{
    @Autowired
    GrossLoanRateDao dao;

    @Override
    public List<GrossLoanRate> findAll() {
        return dao.findAll();
    }
}
