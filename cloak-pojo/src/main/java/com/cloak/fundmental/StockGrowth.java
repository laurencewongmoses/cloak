package com.cloak.fundmental;

import lombok.Getter;
import lombok.Setter;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: StockGrowth
 * @Author: wangpeng
 * @Description: (成长能力)
 * @Date: 2018/5/24 下午2:58
 */
public class StockGrowth {
    @Getter @Setter public String code;
    @Getter @Setter public String name;
    @Getter @Setter public double mbrg;//'主营业务收入增长率(%)',
    @Getter @Setter public double nprg;// '净利润增长率(%)',
    @Getter @Setter public double nav;// '净资产增长率',
    @Getter @Setter public double targ;// '总资产增长率',
    @Getter @Setter public double epsg;// '每股收益增长率',
    @Getter @Setter public double seg;// '股东权益增长率',
}
