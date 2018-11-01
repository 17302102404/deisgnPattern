package org.czx.proxypattern.isjdkproxy;

import org.czx.proxypattern.isjdkproxy.MyFitler;

import java.util.List;

/**
 * Created by zhixuecai on 2018/10/31.
 */
public class Pupil implements MyFitler {

    //小学生想实现list只保留奇数，但是不会做
    @Override
    public List<Integer> fileer(List<Integer> list) {
        System.out.println("我不会做");
        return null;
    }

}
