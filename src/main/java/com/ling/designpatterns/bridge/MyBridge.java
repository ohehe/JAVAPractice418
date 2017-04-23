package com.ling.designpatterns.bridge;/**
 * Created by Administrator on 2017/4/23.
 */

/**
 * 实现的桥接类
 *
 * @author Administrator
 * @create 2017-04-23 21:17
 */
public class MyBridge extends Bridge{
    @Override
    public void method() {
        getSource().method();
    }
}
