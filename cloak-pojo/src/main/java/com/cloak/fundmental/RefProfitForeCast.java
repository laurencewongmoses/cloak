package com.cloak.fundmental;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: RefProfitForeCast
 * @Author: wangpeng
 * @Description: (分配预案)
 * @Date: 2018/5/28
 */
public class RefProfitForeCast {
    @Getter
    @Setter
    public String	code;
    @Getter @Setter public String name;
    @Getter @Setter public BigInteger year;//分配年份
    @Getter @Setter public String report_date;// 公布日期
    @Getter @Setter public double divi;//分红金额（每10股）
    @Getter @Setter public BigInteger shares;//转增和送股数（每10股）
}
