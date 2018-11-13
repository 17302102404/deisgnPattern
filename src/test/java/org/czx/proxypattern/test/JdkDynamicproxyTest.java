package org.czx.proxypattern.test;

import org.czx.proxypattern.isjdkproxy.MyFitler;
import org.czx.proxypattern.isjdkproxy.MyHander;
import org.czx.proxypattern.isjdkproxy.Pupil;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by zhixuecai on 2018/10/31.
 */
public class JdkDynamicproxyTest {

    public static void main(String[] args) {
        //先抓住一点，一定得生成一个代理类，如何生成？ 使用JDk下的Proxy这个类的newProxyInstance方法
        MyFitler p1 = (MyFitler)Proxy.newProxyInstance(JdkDynamicproxyTest.class.getClassLoader(),
                new Class[]{MyFitler.class},
                new MyHander(new Pupil()));

        /**
         * 可以输出一个代理类，从而反编译可以清晰的看懂动态代理的整个工程
         */
        byte[] data = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{MyFitler.class});
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("$Proxy0.class");
            out.write(data);
            out.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);
        ArrayList<Integer> res = (ArrayList<Integer>)p1.fileer(lists);
        System.out.println(Arrays.toString(res.toArray()));
    }
}
