package com.cloak.fundmental;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: StockInfo
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/25
 */
public class StockInfo {
    @Getter @Setter public String code;//代码
    @Getter @Setter public String name;//名称
    @Getter @Setter public String industry;// 所属行业
    @Getter @Setter public String area;//地区
    @Getter @Setter public BigInteger timeToMarket;// 上市日期
    @Getter @Setter public double pe;//市盈率
    @Getter @Setter public double outstanding;// 流通股本(亿)
    @Getter @Setter public double totals;// 总股本(亿)
    @Getter @Setter public double totalAssets;// 总资产(万)
    @Getter @Setter public double liquidAssets;// 流动资产
    @Getter @Setter public double fixedAssets;// 固定资产
    @Getter @Setter public double reserved ;// 公积金
    @Getter @Setter public double reservedPerShare ;// 每股公积金
    @Getter @Setter public double esp ;// 每股收益
    @Getter @Setter public double bvps;// 每股净资
    @Getter @Setter public double pb;// 市净率
    @Getter @Setter public double undp;// 未分利润
    @Getter @Setter public double perundp;// 每股未分配
    @Getter @Setter public double rev;// 收入同比(%)
    @Getter @Setter public double profit;// 利润同比(%)
    @Getter @Setter public double gpr;// 毛利率(%)
    @Getter @Setter public double npr;// 净利润率(%)
    @Getter @Setter public double holders ;// 股东人数
}
