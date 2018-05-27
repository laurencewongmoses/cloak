package com.cloak.stockgross;

/**
 * @PackageName: com.cloak.stock_gross
 * @ClassName: GrossGDPQuarter
 * @Author: wangpeng
 * @Description: (国民生产总值季度)
 * @Date: 2018/5/26
 */
import lombok.Getter;
import lombok.Setter;
public class GrossGDPQuarter {
    @Getter @Setter public double quarter;//
    @Getter @Setter public double gdp;//国内生产总值(亿元)
    @Getter @Setter public double gdp_yoy;//国内生产总值同比增长(%)
    @Getter @Setter public double pi;//第一产业增加值(亿元)
    @Getter @Setter public double pi_yoy;//第一产业增加值同比增长(%)
    @Getter @Setter public double si;//第二产业增加值(亿元)
    @Getter @Setter public double si_yoy;//第二产业增加值同比增长(%)
    @Getter @Setter public double ti;//第三产业增加值(亿元)
    @Getter @Setter public double ti_yoy;//第三产业增加值同比增长(%)
}
