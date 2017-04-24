package com.ling.designpatterns.observer;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 观察者2
 *
 * @author Administrator
 * @create 2017-04-24 14:12
 */
public class Observer2 implements Observer{

    /**
     * 数据更新接口
     */
    @Override
    public void update() {
        System.out.println("observer2 has received.");
    }
}
