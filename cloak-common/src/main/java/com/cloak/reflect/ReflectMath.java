package com.cloak.reflect;

import com.cloak.constants.Constant;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: com.cloak.reflect
 * @ClassName: ReflectMath
 * @Author: wangpeng
 * @Description: (反射获取对象的属性/方法)
 * @Date: 2018/5/27
 */
public class ReflectMath {

    /**
     * 获取对象的所有成员变量
     * @param obj
     * @return
     */
    public static Field[] getFields(Object obj) throws Exception{
        return obj.getClass().getDeclaredFields();
    }

    /**
     * 返回对象中所有double的成员变量及其值
     * @param object
     * @return
     * @throws Exception
     */
    public static Map<String,Double> doubleFieldAndVal(Object object) throws Exception{
        Map<String,Double> map = new HashMap<>();
        for(Field field : object.getClass().getDeclaredFields())
            if(field.getType().getName().equals(Constant.DOUBLE))
                map.put(field.getName(),(double)field.get(object));
        return map;
    }
}
