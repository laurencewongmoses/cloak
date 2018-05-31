package com.cloak.enums;

import lombok.Getter;

/**
 * @PackageName: com.cloak.enums
 * @ClassName: AIndex
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/31 上午11:48
 */
public enum AIndex {
    SZ("sz","深圳指数"),
    HS300("hs300","沪深300指数"),
    SZ50("sz50","上证50"),
    ZXB("zxb","中小板"),
    CYB("cyb","创业板"),
    SH("sh","上证指数");

    @Getter private String code;
    @Getter private String name;

    AIndex(String code,String name){
        this.code = code;
        this.name = name;
    }
}
