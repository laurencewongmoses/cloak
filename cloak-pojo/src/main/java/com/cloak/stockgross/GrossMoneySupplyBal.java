package com.cloak.stockgross;

/**
 * @PackageName: com.cloak.stock_gross
 * @ClassName: GrossMoneySupplyBal
 * @Author: wangpeng
 * @Description: (货币供应余额)
 * @Date: 2018/5/26
 */
import lombok.Getter;
import lombok.Setter;
public class GrossMoneySupplyBal {
    @Getter @Setter public String	year ;
    @Getter @Setter public String  m2 ;//货币和准货币(亿元)
    @Getter @Setter public String  m1 ;//货币(亿元)
    @Getter @Setter public String  m0 ;//流通中现金(亿元)
    @Getter @Setter public String  cd ;//活期存款(亿元)
    @Getter @Setter public String  qm ;//准货币(亿元)
    @Getter @Setter public String  ftd ;//定期存款(亿元)
    @Getter @Setter public String  sd ;//储蓄存款(亿元)
    @Getter @Setter public String  rests ;//其他存款(亿元)
}
