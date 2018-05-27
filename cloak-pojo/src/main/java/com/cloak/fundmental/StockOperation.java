package com.cloak.fundmental;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @PackageName: com.cloak.technical
 * @ClassName: StockOperation
 * @Author: wangpeng
 * @Description: (营运能力)
 * @Date: 2018/5/24 下午2:51
 */
public class StockOperation {
    @Getter @Setter public String code;
    @Getter @Setter public String name;
    @Getter @Setter public String arturnover;//应收账款周转率(次)
    @Getter @Setter public String arturndays;//应收账款周转天数(天)
    @Getter @Setter public String inventory_turnover;//存货周转率(次)
    @Getter @Setter public String inventory_days;//存货周转天数(天)
    @Getter @Setter public String currentasset_turnover;//流动资产周转率(次)
    @Getter @Setter public String currentasset_days;//流动资产周转天数(天)
}
