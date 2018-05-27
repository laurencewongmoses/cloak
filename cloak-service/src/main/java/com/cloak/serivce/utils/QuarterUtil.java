package com.cloak.serivce.utils;

/**
 * @PackageName: com.cloak.serivce.utils
 * @ClassName: QuarterUtil
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/24
 */
public class QuarterUtil {
    public static String quarterStr(int quarter){
        String qStr = "04";
        switch (quarter){
            case 1: qStr = "01";break;
            case 2: qStr = "02";break;
            case 3: qStr = "03";break;
            case 4: qStr = "04";break;
            default: qStr = "04";
        }
        return qStr;
    }
}
