package com.cloak.fundmental;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: RefNewStocks
 * @Author: wangpeng
 * @Description: (新股数据)
 * @Date: 2018/5/28
 */
import lombok.Getter;
import lombok.Setter;
import java.math.BigInteger;

public class RefNewStocks {
    @Getter @Setter public 	String code;
    @Getter @Setter public  String xcode;
    @Getter @Setter public  String name;
    @Getter @Setter public  String ipo_date;//上网发行日期
    @Getter @Setter public  String issue_date;//上市日期
    @Getter @Setter public BigInteger amount;//发行数量(万股)
    @Getter @Setter public BigInteger markets;//上网发行数量(万股)
    @Getter @Setter public double price;//发行价格(元)
    @Getter @Setter public double pe;//发行市盈率
    @Getter @Setter public double limit;//个人申购上限(万股)
    @Getter @Setter public double funds;//募集资金(亿元)
    @Getter @Setter public double ballo;//网上中签率(%)
}
