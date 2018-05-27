package com.cloak.fundmental;

import lombok.Getter;
import lombok.Setter;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: StockReport
 * @Author: wangpeng
 * @Description: (报告)
 * @Date: 2018/5/24 下午3:17
 */
public class StockReport {
    @Getter @Setter public String code;
    @Getter @Setter public String name;
    @Getter @Setter public double eps;// 每股收益
    @Getter @Setter public double eps_yoy;// 每股收益同比(%)
    @Getter @Setter public double bvps;// 每股净资产
    @Getter @Setter public double roe;// 净资产收益率(%)
    @Getter @Setter public double epcf;// 每股现金流量(元)
    @Getter @Setter public double net_profits;// 净利润(万元)
    @Getter @Setter public double profits_yoy;// 净利润同比(%)
    @Getter @Setter public String distrib;// 分配方案
    @Getter @Setter public String report_date;// 发布日期
}
