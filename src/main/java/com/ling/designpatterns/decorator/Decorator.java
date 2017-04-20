package com.ling.designpatterns.decorator;/**
 * Created by Administrator on 2017/4/20.
 */

/**
 * 装饰器
 *
 * @author Administrator
 * @create 2017-04-20 16:22
 */
public class Decorator implements Sourceable{
    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    /**
     * 装饰函数 为原实现增加新功能
     */
    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
