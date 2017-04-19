package com.ling.designpatterns.singleton;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/19.
 */
public class SingletonTest extends TestCase {

    public void testGetInstance() throws Exception {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        assertEquals(a.hashCode(),b.hashCode());
    }
}