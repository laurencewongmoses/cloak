package com.cloak.utils;

/**
 * @PackageName: com.cloak.utils
 * @ClassName: StringUtils
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/31
 */
public class StringUtils {
    public static String getJsonKey(String str){
        if(str == null) return null;
        return str.replace("{","").replace("\"","");
    }

    public static double getJsonVal(String str){
        if(str == null) return 0d;
        String ret = str.replace("{","").replace("\"","").replace("}","");
        return Double.valueOf(ret);
    }
}
