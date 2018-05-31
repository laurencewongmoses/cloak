package com.cloak.convert;

import com.alibaba.fastjson.JSONObject;
import com.cloak.constants.Constant;
import com.cloak.reflect.ReflectMath;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.*;

/**
 * @PackageName: com.cloak.convert
 * @ClassName: ValTo100
 * @Author: wangpeng
 * @Description: (将数值转化到100以内)
 * @Date: 2018/5/26
 */
@Slf4j
public class ValTo100 {

    public static List<JSONObject> valTo100(List<?> list,String field,String date){
        List<JSONObject> ret = new ArrayList<>();
        Map<String,Double> map = new TreeMap<>();
//        Map<String,Double> newMap = new TreeMap<>();
        if(list == null || list.size() == 0) return null;
        double val ;
        String d;//日期
        double min =  99999;
        double max = -99999;

        try {
            for(Object object : list){
                //获取该对象指定double成员变量的值
                val = ReflectMath.doubleFieldAndVal(object,field);
                d = ReflectMath.fieldDate(object,date);
                if(val > max) max = val;
                if(val < min) min = val;
                map.put(d,val);
            }
            if(max - min == 0) return null;
            BigDecimal denominator = new BigDecimal(max - min);
            //计算转换后的值
            for(String key : map.keySet()){
                BigDecimal diff = new BigDecimal(map.get(key)).subtract(new BigDecimal(min));
                double to100 = diff.divide(denominator, Constant.TO100ROUND_SCALE,BigDecimal.ROUND_HALF_UP).doubleValue();
//                newMap.put(key,to100 * Constant.TO100);
                JSONObject object = new JSONObject();
                object.put(key,to100 * Constant.TO100);
                ret.add(object);
            }

        }catch (Exception e){
            log.error("转换异常: "+e.getMessage());
        }
        return ret;
    }
}
