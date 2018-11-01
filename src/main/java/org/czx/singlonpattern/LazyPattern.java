package org.czx.singlonpattern;

/**
 * 懒汉式介绍三种实现单例的方式
 *
 * Created by zhixuecai on 2018/10/29.
 */
public class LazyPattern {
    private static LazyPattern lazyPattern=null;

    //线程非安全的懒汉式
    public static LazyPattern  getFirstInstance(){
        if(lazyPattern == null){
            lazyPattern = new LazyPattern();
        }
        return lazyPattern;
    }

    //线程安全懒汉式，有性能问题
    public synchronized static LazyPattern  getSecondInstance(){
        if(lazyPattern == null){
            lazyPattern = new LazyPattern();
        }
        return lazyPattern;
    }

    //双层锁，无性能问题还线程安全
    public static LazyPattern  getThirdInstance(){
        if(lazyPattern == null){
            synchronized (LazyPattern.class) {
                if(lazyPattern == null){
                    lazyPattern = new LazyPattern();
                }
            }
        }
        return lazyPattern;
    }

}
