package com.cloak.stockgross;

/**
 * @PackageName: com.cloak.stock_gross
 * @ClassName: GrossGDPFor
 * @Author: wangpeng
 * @Description: (三大产品也GDP拉动)
 * @Date: 2018/5/26
 */
import lombok.Getter;
import lombok.Setter;
import java.math.BigInteger;

public class GrossGDPFor {
    @Getter @Setter public BigInteger year;
    @Getter @Setter public double  end_for;//最终消费支出贡献率(%)
    @Getter @Setter public double  for_rate;//最终消费支出拉动(百分点)
    @Getter @Setter public double  asset_for;//资本形成总额贡献率(%)
    @Getter @Setter public double  asset_rate;//资本形成总额拉动(百分点)
    @Getter @Setter public double  goods_for;//货物和服务净出口贡献率(%)
    @Getter @Setter public double  goods_rate;//货物和服务净出口拉动(百分点)\n
}
