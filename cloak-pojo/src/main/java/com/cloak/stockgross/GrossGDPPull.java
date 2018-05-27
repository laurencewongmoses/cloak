package com.cloak.stockgross;

/**
 * @PackageName: com.cloak.stock_gross
 * @ClassName: GrossGDPPull
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

public class GrossGDPPull {
    @Getter @Setter public BigInteger year;
    @Getter @Setter public double  gdp_yoy;//国内生产总值同比增长(%)
    @Getter @Setter public double  pi;//第一产业拉动率(%)
    @Getter @Setter public double  si;//第二产业拉动率(%)
    @Getter @Setter public double  industry;//其中工业拉动(%)
    @Getter @Setter public double  ti;//第三产业拉动率(%)
}
