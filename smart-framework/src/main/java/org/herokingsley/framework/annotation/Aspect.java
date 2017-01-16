package org.herokingsley.framework.annotation;

import java.lang.annotation.*;

/**
 * 切面注解
 * @author Administrator
 * @date 2016/12/10
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {

    /**
     * 注解
     */
    Class<? extends Annotation> value();
}
