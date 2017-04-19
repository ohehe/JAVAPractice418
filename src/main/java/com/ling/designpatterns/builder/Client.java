package com.ling.designpatterns.builder;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 消费者 调用导演类来得到需要的产品
 *
 * @author Administrator
 * @create 2017-04-19 20:23
 */
public class Client {
    public void buyProductV1(){
        Director director = new Director() ;
        director.setProductBuilder(new ProductV1());
        director.construct() ;
    }

    public void buyProductV2(){
        Director director = new Director() ;
        director.setProductBuilder(new ProductV2());
        director.construct() ;
    }
}
