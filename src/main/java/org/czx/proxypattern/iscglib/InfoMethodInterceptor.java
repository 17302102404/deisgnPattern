package org.czx.proxypattern.iscglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zhixuecai on 2018/11/1.
 */
public class  InfoMethodInterceptor  implements MethodInterceptor{


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始时间:"+System.currentTimeMillis());
        Object res = methodProxy.invokeSuper(o,objects);
        System.out.println("结束时间:"+System.currentTimeMillis());
        return res;
    }
}
