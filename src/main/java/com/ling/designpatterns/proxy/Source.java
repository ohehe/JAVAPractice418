package com.ling.designpatterns.proxy;/**
 * Created by Administrator on 2017/4/23.
 */

/**
 * 原始类
 *
 * @author Administrator
 * @create 2017-04-23 15:05
 */
public class Source implements Sourceable{
    /**
     * 原类实现接口
     */
    @Override
    public void method() {
        System.out.println("original method.");
    }
}
