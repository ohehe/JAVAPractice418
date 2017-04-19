package com.ling.designpatterns.singleton;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/19.
 */
public class SingletonWithSynTest extends TestCase {

    public void testGetInstance() throws Exception {
        SingletonWithSyn singletonWithSyn1 = SingletonWithSyn.getInstance() ;
        SingletonWithSyn singletonWithSyn2 = SingletonWithSyn.getInstance() ;
        assertEquals(singletonWithSyn1.hashCode(),singletonWithSyn2.hashCode());
    }
}