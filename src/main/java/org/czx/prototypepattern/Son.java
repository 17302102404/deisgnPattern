package org.czx.prototypepattern;

import java.io.Serializable;

/**
 * Created by zhixuecai on 2018/10/31.
 */
public class Son implements Serializable{

    private  String  name;

    private  String  age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
