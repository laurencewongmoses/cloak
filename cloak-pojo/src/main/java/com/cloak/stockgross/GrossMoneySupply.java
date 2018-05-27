package com.cloak.stockgross;

/**
 * @PackageName: com.cloak.stock_gross
 * @ClassName: GrossMoneySupply
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
import lombok.Getter;
import lombok.Setter;
public class GrossMoneySupply {
    @Getter @Setter	public String month;
    @Getter @Setter	public String m2  ;//货币和准货币（广义货币M2）(亿元)
    @Getter @Setter	public String m2_yoy  ;//货币和准货币（广义货币M2）同比增长(%)
    @Getter @Setter	public String m1  ;//货币(狭义货币M1)(亿元)
    @Getter @Setter	public String m1_yoy  ;//货币(狭义货币M1)同比增长(%)
    @Getter @Setter	public String m0  ;//流通中现金(M0)(亿元)
    @Getter @Setter	public String m0_yoy  ;//流通中现金(M0)同比增长(%)
    @Getter @Setter	public String cd  ;//活期存款(亿元)
    @Getter @Setter	public String cd_yoy  ;//活期存款同比增长(%)
    @Getter @Setter	public String qm  ;//准货币(亿元)
    @Getter @Setter	public String qm_yoy  ;//准货币同比增长(%)
    @Getter @Setter	public String ftd  ;//定期存款(亿元)
    @Getter @Setter	public String ftd_yoy  ;//定期存款同比增长(%)
    @Getter @Setter	public String sd  ;//储蓄存款(亿元)
    @Getter @Setter	public String sd_yoy  ;//储蓄存款同比增长(%)
    @Getter @Setter	public String rests  ;//其他存款(亿元)
    @Getter @Setter	public String rests_yoy  ;//其他存款同比增长(%)
}
