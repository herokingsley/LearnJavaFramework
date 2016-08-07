package org.herokingsley.chapter2.util;

import sun.swing.StringUIClientPropertyKey;

/**
 * 转型操作工具类
 * <br/>Author: her0kings1ey
 * <br/>Date: 2016/8/3
 */
public final class CastUtil {

    /**
     * 转为String型
     * @param obj
     * @return
     */
    public static String castString(Object obj){
        return CastUtil.castString(obj, "");
    }

    /**
     * 转为String型（提供默认值）
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castString(Object obj, String defaultValue){
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为double型
     * @param obj
     * @return
     */
    public static double castDouble(Object obj){
        return CastUtil.castDouble(obj, 0);
    }

    /**
     * 转为double型
     * @param obj
     * @return
     */
    public static double castDouble(Object obj, double defaultValue){
        double doubleValue = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUt)
        }
    }
}
