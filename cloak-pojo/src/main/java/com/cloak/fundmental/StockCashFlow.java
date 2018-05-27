package com.cloak.fundmental;

import lombok.Getter;
import lombok.Setter;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: StockCashFlow
 * @Author: wangpeng
 * @Description: (现金流)
 * @Date: 2018/5/24 下午3:12
 */
public class StockCashFlow {
    @Getter @Setter public String code ;
    @Getter @Setter public String name ;
    @Getter @Setter public double cf_sales;// 经营现金净流量对销售收入比率
    @Getter @Setter public double rateofreturn;// 资产的经营现金流量回报率
    @Getter @Setter public double cf_nm;// 经营现金净流量与净利润的比率
    @Getter @Setter public double cf_liabilities;// 经营现金净流量对负债比率
    @Getter @Setter public double ashflowratio;// 现金流量比率
}
