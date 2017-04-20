package com.ling.designpatterns.Adapter;/**
 * Created by Administrator on 2017/4/20.
 */

/**
 * 目标接口
 *
 * @author Administrator
 * @create 2017-04-20 15:28
 */
public interface Targetable {
    public void method1() ;

    /**
     * 原类中不具有的新方法
     */
    public void method2() ;
}
