package com.ling.designpatterns.bridge;/**
 * Created by Administrator on 2017/4/23.
 */



/**
 * 实现类1
 *
 * @author Administrator
 * @create 2017-04-23 20:15
 */
public class SourceSub1 implements Sourceable{
    @Override
    public void method() {
        System.out.println("first subSource.");
    }
}
