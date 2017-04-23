package com.ling.designpatterns.proxy;/**
 * Created by Administrator on 2017/4/23.
 */

/**
 * 代理类
 *
 * @author Administrator
 * @create 2017-04-23 15:07
 */
public class Proxy implements Sourceable {
    private Source source ;
    public Proxy(){
        super();
        this.source = new Source() ;
    }

    private void before(){
        System.out.println("before proxy!");
    }

    private void after(){
        System.out.println("after proxy!");
    }
    /**
     * 原类实现接口
     */
    @Override
    public void method() {

    }
}
