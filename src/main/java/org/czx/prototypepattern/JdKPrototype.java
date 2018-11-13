package org.czx.prototypepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhixuecai on 2018/10/31.
 */
public class JdKPrototype {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("czx");
        p.setAge("50");
        try {
            Person p1 = (Person)p.clone();
            System.out.println(p1.getName()+","+p1.getAge());
            System.out.println(p==p1);  //false 说明p和p1不是一个对象
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Son son = new Son();
        son.setAge("18");
        son.setName("zc");
        List<Son> sons = new ArrayList<Son>();
        sons.add(son);
        p.setListson(sons);
        try {
            Person p2 = (Person)p.clone();
            System.out.println(p2.getListson().get(0).getName()+","+p2.getListson().get(0).getAge());
            System.out.println(p.getListson().get(0) == p2.getListson().get(0));
            //ture 说明传统的jdk提供的clone方法只能达到一个浅复制
            //只有第一层的对象不是同一片内存空间，但子元素还是同一个引用

            Person p3 = (Person)p.deepclone();
            System.out.println(p3.getListson().get(0).getName()+","+p3.getListson().get(0).getAge());
            System.out.println(p.getListson().get(0) == p3.getListson().get(0));
            //false  说明实现了隔离，son的引用已经发生了变化

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
