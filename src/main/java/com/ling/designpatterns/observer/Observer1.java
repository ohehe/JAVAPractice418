package com.ling.designpatterns.observer;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 观察者类1
 *
 * @author Administrator
 * @create 2017-04-24 14:04
 */
public class Observer1 implements Observer{
    /**
     * 数据更新接口
     */
    @Override
    public void update() {
        System.out.println("observer1 has received.");
    }
}
