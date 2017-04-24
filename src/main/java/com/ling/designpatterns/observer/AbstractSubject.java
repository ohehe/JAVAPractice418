package com.ling.designpatterns.observer;/**
 * Created by Administrator on 2017/4/24.
 */

import java.util.Enumeration;
import java.util.Vector;

/**
 * 实现接口的抽象类
 *
 * @author Administrator
 * @create 2017-04-24 14:18
 */
public abstract class AbstractSubject implements Subject{
    private Vector<Observer> vector = new Vector<Observer>() ;

    /**
     * 增加观察者
     *
     * @param observer
     */
    @Override
    public void add(Observer observer) {
        vector.add(observer) ;
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    @Override
    public void del(Observer observer) {
        vector.remove(observer) ;
    }

    /**
     * 通知所有的观察者
     */
    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements() ;
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }

    /**
     * 自身的操作
     */
    @Override
    public void operation() {

    }


}
