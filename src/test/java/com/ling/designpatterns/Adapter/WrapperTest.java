package com.ling.designpatterns.Adapter;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/20.
 */
public class WrapperTest extends TestCase {

    public void testMethod1() throws Exception {
        Source source = new Source() ;
        Targetable target = new Wrapper(source) ;
        target.method1();
        target.method2();
    }
}