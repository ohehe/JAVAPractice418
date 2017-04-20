package com.ling.designpatterns.Adapter;/**
 * Created by Administrator on 2017/4/20.
 */

/**
 * 实现method2的实现类
 *
 * @author Administrator
 * @create 2017-04-20 15:56
 */
public class SourceSubM2 extends WrapperForInterface{
    @Override
    public void method2() {
        System.out.println("method2 in SourceSubM2.");
    }
}
