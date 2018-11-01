package org.czx.singlonpattern;

/**
 * 饿汗式，类加载阶段对象已初始化，无论后面是否会被使用
 * Created by zhixuecai on 2018/10/29.
 */
public class HungryPattern {

    private  static  HungryPattern hungryPattern = new HungryPattern();

    public  static  HungryPattern getInstance(){
        return  hungryPattern;
    }
}
