package com.ling.designpatterns.observer;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 控制接口
 *
 * @author Administrator
 * @create 2017-04-24 14:13
 */
public interface Subject {
    /**
     * 增加观察者
     * @param observer
     */
    public void add(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void del(Observer observer) ;

    /**
     * 通知所有的观察者
     */
    public void notifyObservers() ;

    /**
     * 自身的操作
     */
    public void operation() ;
}
