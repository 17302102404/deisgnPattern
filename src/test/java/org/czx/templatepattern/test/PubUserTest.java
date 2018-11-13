package org.czx.templatepattern.test;

import org.czx.observerpattern.Publisher;
import org.czx.observerpattern.User;

/**
 * 这就是一个简单的发布订阅的过程
 * Created by zhixuecai on 2018/11/8.
 */
public class PubUserTest {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        User user1 = new User("杭杭");
        User user2 = new User("李红");
        User user3 = new User("珠子");
        publisher.registerObserver(user1);
        publisher.registerObserver(user2);
        publisher.registerObserver(user3);
        publisher.notifyObservers("各位好，明天放假");
        publisher.removeObserver(user3);
        publisher.notifyObservers("珠子犯错误被辞退了");
    }
}
