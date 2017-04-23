package com.ling.designpatterns.bridge;/**
 * Created by Administrator on 2017/4/23.
 */

/**
 * @author Administrator
 * @create 2017-04-23 21:14
 */
public class SourceSub2 implements Sourceable{
    @Override
    public void method() {
        System.out.println("second source.");
    }
}
