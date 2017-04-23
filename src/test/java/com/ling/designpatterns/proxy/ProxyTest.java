package com.ling.designpatterns.proxy;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/23.
 */
public class ProxyTest extends TestCase {

    public void testMethod() throws Exception {
        Sourceable source = new Proxy() ;
        source.method();
    }
}