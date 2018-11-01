package org.czx.prototypepattern;

import java.io.*;
import java.util.List;

/**
 * 能克隆必须实现Cloneable接口
 *
 * Created by zhixuecai on 2018/10/31.
 */
public class Person  implements  Cloneable,Serializable{

    private List<Son> listson;

    private String name;

    private  String age;

    public List<Son> getListson() {
        return listson;
    }

    public void setListson(List<Son> listson) {
        this.listson = listson;
    }

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

    /*
       传统的clone方法是浅复制
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*
       利用序列化，再反序列化读出来实现深度复制
     */

    public   Person  deepclone() {
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            // 将sourceObj对象序列化成流,因为写在流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。
            // 所以利用这个特性可以实现对象的深拷贝
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);
            // 将流序列化成对象
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object targetOjb = objectInputStream.readObject();
            return  (Person)targetOjb;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                byteArrayOutputStream = null;
                byteArrayInputStream = null;
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
