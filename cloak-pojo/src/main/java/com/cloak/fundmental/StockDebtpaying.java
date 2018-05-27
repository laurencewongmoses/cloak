package com.cloak.fundmental;

import lombok.Getter;
import lombok.Setter;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: StockDebtpaying
 * @Author: wangpeng
 * @Description: (偿债能力)
 * @Date: 2018/5/24 下午3:10
 */
public class StockDebtpaying {
    @Getter @Setter public String code;
    @Getter @Setter public String name ;
    @Getter @Setter public String currentratio ;// 流动比率
    @Getter @Setter public String quickratio ;// 速动比率
    @Getter @Setter public String cashratio ;// 现金比率
    @Getter @Setter public String icratio ;// 利息支付倍数
    @Getter @Setter public double sheqratio ;// 股东权益比率
    @Getter @Setter public double adratio;// 股东权益增长率
}
