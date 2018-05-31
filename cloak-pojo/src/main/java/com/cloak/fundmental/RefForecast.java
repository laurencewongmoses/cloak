package com.cloak.fundmental;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: RefForecast
 * @Author: wangpeng
 * @Description: (业绩预告)
 * @Date: 2018/5/28
 */
import lombok.Getter;
import lombok.Setter;
public class RefForecast {
    @Getter @Setter public String code;//
    @Getter @Setter public String name;//
    @Getter @Setter public String type;//业绩变动类型[预增/预亏等]
    @Getter @Setter public String report_date;//'发布日期'
    @Getter @Setter public double pre_eps;//'上年同期每股收益'
    @Getter @Setter public String range;//'业绩变动范围'
}
