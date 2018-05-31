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

    /**
     * 返回日期的字符串
     * @param object
     * @param fieldName
     * @return
     * @throws Exception
     */
    public static String fieldDate(Object object,String fieldName) throws Exception{
        if(object == null || fieldName == null) {
            throw new Exception("传入需要转换的对象为空,或成员变量为空!");
        }
        Field field = object.getClass().getDeclaredField(fieldName);
        if(field == null){
            throw new Exception("传入的成员变量不存在!");
        }
        if(field.getType().getName().equals("java.lang.String")){
            return (String)field.get(object);
        }else{
            return String.valueOf(field.get(object));
        }
    }

    /**
     * 返回对象中指定的double类型成员变量及其值
     * @param object
     * @return
     * @throws Exception
     */
    public static double doubleFieldAndVal(Object object,String fieldName) throws Exception{
        if(object == null || fieldName == null){
            throw new Exception("传入需要转换的对象为空,或成员变量为空!");
        }
        double ret ;
        Field field = object.getClass().getDeclaredField(fieldName);
        if(field == null){
            throw new Exception("传入的成员变量不存在!");
        }

        if(field.getType().getName().equals(Constant.DOUBLE) && field.getName().equals(fieldName))
            ret = (double)field.get(object);
        else
            throw new Exception("传入的成员变量为非double类型");
//        for(Field field : object.getClass().getDeclaredFields())
//            if(field.getType().getName().equals(Constant.DOUBLE) && field.getName().equals(fieldName)){
//                map.put(field.getName(),(double)field.get(object));
//                break;
//            }
        return ret;
    }

//    public static void main(String[] args)throws Exception{
//        BaseStockHistory history = new BaseStockHistory();
//        history.setDate("2018-01-01");
//        history.setClose(20.0);
//        GrossGDPContrib contrib = new GrossGDPContrib();
//        contrib.setYear(BigInteger.valueOf(2018));
//
//        System.out.println(ReflectMath.fieldDate(history,"date"));
//        System.out.println(ReflectMath.fieldDate(history,"close"));
//        System.out.println(ReflectMath.doubleFieldAndVal(contrib,"year"));
//    }
}
