package org.czx.singelonpattern.test;

import net.sf.cglib.proxy.Enhancer;
import org.czx.proxypattern.iscglib.InfoMethodInterceptor;
import org.czx.proxypattern.iscglib.Logger;

/**
 * Created by zhixuecai on 2018/11/1.
 */
public class CglibPatternTest {
    /**
     * cglib的动态代理不需要代理实现接口的限制，但是jdk的动态代理必须实现某个接口
     * cglib的动态代理其实是二进制字节码的重组。
     *
     * 其实有兴趣的话自己可以手动写一个动态代理类实现的过程，基本流程如下：
     * 1.代理类
     * 2.对代理类中方法的改造类(hander)
     * 3.对代理类和hander进行重组生成一个新的类(java 字符串生成一个java文件)
     * 4.java对象进行编译生成class文件
     * 5.jvm动态加载class文件生成代理类的代理对象。
     *
     * @param args
     */

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Logger.class);//继承被代理类
        enhancer.setCallback(new InfoMethodInterceptor());//设置回调
        Logger logger = (Logger)enhancer.create();
        logger.info();
    }
}
