package com.ling.designpatterns.Adapter;/**
 * Created by Administrator on 2017/4/20.
 */

/**
 * 实现method1的实现类
 *
 * @author Administrator
 * @create 2017-04-20 15:55
 */
public class SourceSubM1 extends WrapperForInterface {
    @Override
    public void method1() {
        System.out.println("method1 in SourceSubM1.");
    }
}
