package com.ling.designpatterns.decorator;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/20.
 */
public class DecoratorTest extends TestCase {

    public void testMethod() throws Exception {
        Sourceable sourceable = new Source() ;
        Sourceable obj = new Decorator(sourceable) ;
        obj.method();
    }
}