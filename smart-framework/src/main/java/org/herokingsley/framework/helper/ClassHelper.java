package org.herokingsley.framework.helper;

import org.herokingsley.framework.annotation.Controller;
import org.herokingsley.framework.annotation.Service;
import org.herokingsley.framework.util.ClassUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * 类操作助手类
 * @author Administrator
 * @date 2016/11/13
 */
public final class ClassHelper {

    /**
     * 定义类集合（用于存放所加载的类）
     */
    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    /**
     * 获取应用包名下所有类
     * @return
     */
    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    /**
     * 获取应用包名下所有Service类
     * @return
     */
    public static Set<Class<?>> getServiceClassSet(){
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for(Class<?> cls: CLASS_SET){
                if(cls.isAnnotationPresent(Service.class)){
                    classSet.add(cls);
                }
        }
        return classSet;
    }

    /**
     * 获取应用包名下所有Controller类
     * @return
     */
    public static Set<Class<?>> getControllerClassSet(){
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for(Class<?> cls: CLASS_SET){
            if(cls.isAnnotationPresent(Controller.class)){
                classSet.add(cls);
            }
        }
        return classSet;
    }

    /**
     * 获取应用包名下所有Bean类（包括：Service、Controller等）
     * @return
     */
    public static Set<Class<?>> getBeanClassSet(){
        Set<Class<?>>beanClassSet = new HashSet<Class<?>>();
        beanClassSet.addAll(getServiceClassSet());
        beanClassSet.addAll(getControllerClassSet());
        return beanClassSet;
    }
}
