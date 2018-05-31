package com.cloak.math;

import com.alibaba.fastjson.JSONObject;
import com.cloak.utils.StringUtils;

import java.util.*;

/**
 * @PackageName: com.cloak.math
 * @ClassName: JSONObjectMath
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/31
 */
public class JSONObjectMath {

    public static List<JSONObject> fullDate(List<JSONObject> standard,List<JSONObject> target){
        List<JSONObject> ret = new ArrayList<>();
        TreeSet<String> date_s = new TreeSet<>();
        if(standard == null || standard.size() == 0) return ret;
        TreeMap<String,Double> map = new TreeMap<>();

        for(JSONObject object : standard){
            String objStr = object.toString();
            String key = objStr.split(":")[0];
            date_s.add(StringUtils.getJsonKey(key));
        }
        for(JSONObject object :target){
           String objStr = object.toString();
           String key = objStr.split(":")[0];
           String val = objStr.split(":")[1];
           map.put(StringUtils.getJsonKey(key), StringUtils.getJsonVal(val));
        }
        for(String str : date_s){
            JSONObject jsonObject = new JSONObject();
            if(map.get(str) != null){
                jsonObject.put(str,map.get(str));
            }else {
                jsonObject.put(str,-10);
            }
            ret.add(jsonObject);
        }
        return ret;
    }
}
