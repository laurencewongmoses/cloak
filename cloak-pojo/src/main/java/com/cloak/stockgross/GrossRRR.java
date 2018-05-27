package com.cloak.stockgross;

import lombok.Getter;
import lombok.Setter;

/**
 * @PackageName: com.cloak.stock_gross
 * @ClassName: GrossRRR
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
public class GrossRRR {
    @Getter @Setter  public String date;
    @Getter @Setter  public String befor;//调整前存款准备金率(%)
    @Getter @Setter  public String now;//调整后存款准备金率(%)
    @Getter @Setter  public String changed;//调整幅度(%)
}
