package com.ling.designpatterns.Adapter;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/20.
 */
public class AdapterTest extends TestCase {
    /**
     * method:testMethod2
     * @description 测试类的适配器
     * @param
     * @return void
     * @throws
     *
     * @author Administrator
     * @date 2017/4/20
     */
    public void testMethod2() throws Exception {
        Targetable target = new Adapter() ;
        target.method1();
        target.method2();
    }
}