package com.ling.designpatterns.Adapter;/**
 * Created by Administrator on 2017/4/20.
 */

/**
 * 类的适配器你
 *
 * @author Administrator
 * @create 2017-04-20 15:31
 */
public class Adapter extends Source implements Targetable{
    /**
     * 原类中不具有的新方法
     */
    @Override
    public void method2() {
        System.out.println("this is the targetable method.");
    }
}
