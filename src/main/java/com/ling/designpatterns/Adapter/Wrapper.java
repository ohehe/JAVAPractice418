package com.ling.designpatterns.Adapter;/**
 * Created by Administrator on 2017/4/20.
 */

/**
 * 对象的适配器模式
 *
 * @author Administrator
 * @create 2017-04-20 15:36
 */
public class Wrapper implements Targetable{
    private Source source ;

    Wrapper(Source source){
        super();
        this.source = source ;
    }

    @Override
    public void method1() {
        source.method1();
    }

    /**
     * 原类中不具有的新方法
     */
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
