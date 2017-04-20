package com.ling.designpatterns.Adapter;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/20.
 */
public class WrapperForInterfaceTest extends TestCase {

    public void testMethod1() throws Exception {
        Sourceable source1 = new SourceSubM1() ;
        Sourceable source2 = new SourceSubM2() ;
        source1.method1();
        source2.method1();
    }

    public void testMethod2() throws Exception {
        Sourceable source1 = new SourceSubM1() ;
        Sourceable source2 = new SourceSubM2() ;
        source1.method2();
        source2.method2();
    }
}