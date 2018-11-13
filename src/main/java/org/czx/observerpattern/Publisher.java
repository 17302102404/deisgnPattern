package org.czx.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhixuecai on 2018/11/7.
 */
public class Publisher implements Observable {

    List<Observer>  observers = null;

    public Publisher(){
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for(Observer observer: observers){
            observer.update(msg);
        }
    }
}
