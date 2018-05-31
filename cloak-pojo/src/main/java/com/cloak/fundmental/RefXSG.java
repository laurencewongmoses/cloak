package com.cloak.fundmental;

/**
 * @PackageName: com.cloak.fundmental
 * @ClassName: RefXSG
 * @Author: wangpeng
 * @Description: (限售解禁)
 * @Date: 2018/5/28
 */
import lombok.Getter;
import lombok.Setter;
public class RefXSG {
    @Getter @Setter public String  code;//
    @Getter @Setter public String  name;//
    @Getter @Setter public String  date;//解禁日期
    @Getter @Setter public String  count;//解禁数量（万股）
    @Getter @Setter public String  ratio;//占总盘比率
}
