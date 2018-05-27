package com.cloak.serivce.stock.stockgross;


import com.cloak.stockgross.GrossGDPContrib;

import java.util.List;

/**
 * @PackageName: com.cloak.serivce.stock.stockgross
 * @ClassName: GrossCPIService
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26 上午11:43
 */
public interface GrossGDPContirbService {
    List<GrossGDPContrib> findAll();
}
