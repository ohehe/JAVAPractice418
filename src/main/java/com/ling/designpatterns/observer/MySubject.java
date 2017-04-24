package com.ling.designpatterns.observer;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 实现的主类
 *
 * @author Administrator
 * @create 2017-04-24 14:44
 */
public class MySubject extends AbstractSubject{
    @Override
    public void operation() {
        notifyObservers();
    }
}
