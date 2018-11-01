package org.czx.proxypattern.test;

import org.czx.proxypattern.isstatic.Itperson;
import org.czx.proxypattern.isstatic.MarriageAgency;

/**
 * 静态代理的测试
 * Created by zhixuecai on 2018/10/31.
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        new MarriageAgency(new Itperson()).findGirlFriend();
    }
}
