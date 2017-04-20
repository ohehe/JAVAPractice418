package com.ling.designpatterns.Adapter;/**
 * Created by Administrator on 2017/4/20.
 */

/**
 * 接口的适配器模式
 *
 * @author Administrator
 * @create 2017-04-20 15:52
 */
public abstract class WrapperForInterface implements Sourceable {
    /**
     * 对接口中的冗余部分已经默认实现  继承的示例中可以只实现一部分
     */
    public void method1() {
        System.out.println("method1 in Wrapper");
    }


    public void method2() {
        System.out.println("method2 in Wrapper");
    }

}
