package org.czx.proxypattern.isstatic;

import org.czx.proxypattern.isstatic.Itperson;

/**
 * 这就是一个简单的静态代理，如果要一个规范的话，可以给代理类和搭理实现一个接口，代理的方法
 * 统一管理。
 * Created by zhixuecai on 2018/10/31.
 */
public class MarriageAgency {
     Itperson itperson;

     public  MarriageAgency(Itperson itperson){
         this.itperson = itperson;
     }

     public void findGirlFriend() {
         System.out.println("请输入你的需求");
         itperson.findGirlFriend();
         System.out.println("给你找了个女朋友");
     }
}
