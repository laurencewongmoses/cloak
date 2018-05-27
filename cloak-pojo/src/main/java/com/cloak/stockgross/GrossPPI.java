package com.cloak.stockgross;

/**
 * @PackageName: com.cloak.stock_gross
 * @ClassName: GrossPPI
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
import lombok.Getter;
import lombok.Setter;
public class GrossPPI {
    @Getter @Setter public String month ;//统计月份
    @Getter @Setter public double ppiip ;//工业品出厂价格指数
    @Getter @Setter public double ppi ;//生产资料价格指数
    @Getter @Setter public double qm ;//采掘工业价格指数
    @Getter @Setter public double rmi ;//原材料工业价格指数
    @Getter @Setter public double pi ;//加工工业价格指数\n加工工业价格指数\n加工工业价格指数\n加工工业价格指数\n
    @Getter @Setter public double cg ;//生活资料价格指数
    @Getter @Setter public double food ;//食品类价格指数
    @Getter @Setter public double clothing ;//衣着类价格指数
    @Getter @Setter public double roeu ;//一般日用品价格指数
    @Getter @Setter public double dcg ;//耐用消费品价格指数
}
