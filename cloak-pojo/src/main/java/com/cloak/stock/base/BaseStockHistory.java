package com.cloak.stock.base;

import lombok.Getter;
import lombok.Setter;
/**
 * @PackageName: com.cloak.stock.base
 * @ClassName: BaseStockHistory
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/21 下午8:01
 */
public class BaseStockHistory {
    @Getter @Setter public String date;//交易日期
    @Getter @Setter public Double open;//开盘价
    @Getter @Setter public Double high;//最高价
    @Getter @Setter public Double close;//收盘价
    @Getter @Setter public Double low;//最低价
    @Getter @Setter public Double volume;//成交量
    @Getter @Setter public Double price_change;//价格变动
    @Getter @Setter public Double p_change;//涨跌幅
    @Getter @Setter public Double ma5;//5日均价
    @Getter @Setter public Double ma10;//10日均价
    @Getter @Setter public Double ma20;//20日均价
    @Getter @Setter public Double v_ma5;//5日均量
    @Getter @Setter public Double v_ma10;//10日均量
    @Getter @Setter public Double v_ma20;//20日均量
    @Getter @Setter public Double turnover;//换手率
}
