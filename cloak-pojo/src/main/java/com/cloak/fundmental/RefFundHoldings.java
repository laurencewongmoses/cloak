package com.cloak.fundmental;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: RefFundHoldings
 * @Author: wangpeng
 * @Description: (基金持股)
 * @Date: 2018/5/28
 */
import lombok.Getter;
import lombok.Setter;
public class RefFundHoldings {
    @Getter @Setter public String code;//
    @Getter @Setter public String name;//
    @Getter @Setter public String date;//报告日期
    @Getter @Setter public String nums;//基金家数
    @Getter @Setter public String nlast;//与上期相比（增加或减少了）
    @Getter @Setter public String count;//基金持股数（万股）
    @Getter @Setter public String clast;//与上期相比
    @Getter @Setter public String amount;//基金持股市值
    @Getter @Setter public String ratio;//占流通盘比率
}
