package org.czx.observerpattern;

/**
 * 定义被观察者的接口,用户订阅，用户取消订阅，群发消息通知
 *
 * Created by zhixuecai on 2018/11/7.
 */
public interface Observable {

    //注册为一个观察者
    public void registerObserver(Observer observer);

    //取消观察者
    public void removeObserver(Observer observer);

    //通知所有观察者更新信息
    public void notifyObservers(String msg);

}
