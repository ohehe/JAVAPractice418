package com.ling.designpatterns.decorator;/**
 * Created by Administrator on 2017/4/20.
 */

/**
 * 被装饰类
 *
 * @author Administrator
 * @create 2017-04-20 16:17
 */
public class Source implements Sourceable{
    /**
     * 被装饰函数
     */
    @Override
    public void method() {
        System.out.println("the original method.");
    }
}
