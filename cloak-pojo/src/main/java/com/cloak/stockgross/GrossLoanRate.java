package com.cloak.stockgross;


import lombok.Getter;
import lombok.Setter;

/**
 * @PackageName: com.cloak.stock_gross
 * @ClassName: GrossLoanRate
 * @Author: wangpeng
 * @Description: (贷款利率)
 * @Date: 2018/5/26
 */
public class GrossLoanRate {
    @Getter @Setter public String date;
    @Getter @Setter public String loan_type;//存款种类
    @Getter @Setter public String rate;//利率
}
