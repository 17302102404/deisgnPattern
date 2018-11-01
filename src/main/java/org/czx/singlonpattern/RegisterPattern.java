package org.czx.singlonpattern;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.ObjDoubleConsumer;

/**
 * 注册式单例模式的实现，适用于多个对象的单例模式管理
 * 并且spring 的单例模式实现就是基于一个注册式单例模式，
 * 使用容器缓存区管理对象。
 * Created by zhixuecai on 2018/10/29.
 */
public class RegisterPattern {

    private static ConcurrentHashMap<String,Object> map = new ConcurrentHashMap();

    public  static  Object getInstance(String name){
         if(name == null){
             return new RegisterPattern();
         }

         if(map.get(name) == null) {
             map.put("name", new RegisterObject());
         }
         return map.get("name");
    }

}
