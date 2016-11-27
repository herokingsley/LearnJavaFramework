package org.herokingsley.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 数组工具类
 * @author Administrator
 * @date 2016/11/27
 */
public final class ArrayUtil {

    /**
     * 判断数组是否非空
     * @param array
     * @return
     */
    public static boolean isNotEmpty(Object[] array){
        return !ArrayUtil.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     * @param array
     * @return
     */
    public static boolean isEmpty(Object[] array){
        return ArrayUtils.isEmpty(array);
    }
}
