package com.cloak.stockgross;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

/**
 * @PackageName: com.cloak.stock_gross
 * @ClassName: GrossGDPContrib
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
public class GrossGDPContrib {
    @Getter @Setter public BigInteger year;//
    @Getter @Setter public double gdp_yoy;// 国内生产总值
    @Getter @Setter public double pi;// 第一产业献率(%)
    @Getter @Setter public double si;// 第二产业献率(%)
    @Getter @Setter public double industry ;// 其中工业献率(%)
    @Getter @Setter public double ti;// 第三产业献率(%)
}
