package org.czx.observerpattern;

/**
 * Created by zhixuecai on 2018/11/7.
 */
public class User  implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name+"收到消息:"+msg);
    }
}
