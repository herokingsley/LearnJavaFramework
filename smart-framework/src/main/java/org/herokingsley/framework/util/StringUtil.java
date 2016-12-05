package org.herokingsley.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串工具类
 * <br/>Author: her0kings1ey
 * <br/>Date: 2016/8/7
 */
public final class StringUtil {

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }

    public static String[] splitString(String str, String splitDelimeter){
        if(str == null){
            return new String[]{};
        }
        return str.split(splitDelimeter);
    }
}
