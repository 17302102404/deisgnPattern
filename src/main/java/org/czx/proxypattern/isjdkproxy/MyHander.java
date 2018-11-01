package org.czx.proxypattern.isjdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 专门处理拦截器的事件代理
 * Created by zhixuecai on 2018/10/31.
 */
public class MyHander  implements InvocationHandler{
    private Object target;

    public MyHander(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object retVal = method.invoke(target, args);
        if ("fileer".equals(method.getName())){
            List<Integer> lists = (List<Integer>)args[0];
            List<Integer> newList =new ArrayList<>();
            for(Integer i:lists){
                if(i%2 == 0){
                    newList.add(i);
                }
            }
            retVal=newList;
            System.out.println("去奇数完成");
        }
        return retVal;
    }
}
