package com.cloak.stockgross;

/**
 * @PackageName: com.cloak.stock_gross
 * @ClassName: GrossGDPYear
 * @Author: wangpeng
 * @Description: (国民生产总值-年度)
 * @Date: 2018/5/26
 */
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;


public class GrossGDPYear {
    @Getter @Setter public BigInteger year ;//
    @Getter @Setter public double gdp;//国内生产总值(亿元)
    @Getter @Setter public double pc_gdp;//人均国内生产总值(元)
    @Getter @Setter public double gnp;//国民生产总值(亿元)
    @Getter @Setter public double pi;//第一产业(亿元)
    @Getter @Setter public double si;//第二产业(亿元)
    @Getter @Setter public double industry;//工业(亿元)
    @Getter @Setter public double cons_industry;//建筑业(亿元)
    @Getter @Setter public double ti;//第三产业(亿元)
    @Getter @Setter public double trans_industry;//交通运输仓储邮电通信业(亿元)
    @Getter @Setter public double lbdy;//批发零售贸易及餐饮业(亿元)
}
