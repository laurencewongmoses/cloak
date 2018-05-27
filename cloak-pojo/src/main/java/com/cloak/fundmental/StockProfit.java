package com.cloak.fundmental;

import lombok.Getter;
import lombok.Setter;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: StockProfit
 * @Author: wangpeng
 * @Description: (盈利能力)
 * @Date: 2018/5/24 下午3:15
 */
public class StockProfit {
    @Getter @Setter public String code;
    @Getter @Setter public String name;
    @Getter @Setter public double roe;// 净资产收益率(%)
    @Getter @Setter public double net_profit_ratio ;// 净利率(%)
    @Getter @Setter public double gross_profit_rate ;// 毛利率(%)
    @Getter @Setter public double net_profits ;// 净利润(万元)
    @Getter @Setter public double eps ;// 每股收益
    @Getter @Setter public double business_income ;// 营业收入(百万元)
    @Getter @Setter public double bips ;// 每股主营业务收入(元)
}
