package org.herokingsley.framework.bean;

import org.herokingsley.framework.util.CastUtil;

import java.util.Map;

/**
 * 请求参数对象
 * @author Administrator
 * @date 2016/11/27
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name){
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String, Object> getMap(){
        return paramMap;
    }
}
