package org.herokingsley.framework;

import org.herokingsley.framework.helper.BeanHelper;
import org.herokingsley.framework.helper.ClassHelper;
import org.herokingsley.framework.helper.ControllerHelper;
import org.herokingsley.framework.helper.IocHelper;
import org.herokingsley.framework.util.ClassUtil;

/**
 * 加载相应的Helper类
 * @author Administrator
 * @date 2016/11/27
 */
public final class HelperLoader {

    public static void init(){
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for(Class<?> cls: classList){
            ClassUtil.loadClass(cls.getName(), false);
        }
    }
}
