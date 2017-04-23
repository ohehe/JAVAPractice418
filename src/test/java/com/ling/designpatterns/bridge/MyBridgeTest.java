package com.ling.designpatterns.bridge;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/23.
 */
public class MyBridgeTest extends TestCase {

    public void testMethod() throws Exception {

        Bridge bridge = new MyBridge();
        Sourceable sourceable1 = new SourceSub1() ;
        bridge.setSource(sourceable1);
        bridge.method();

        Sourceable sourceable2 = new SourceSub2()  ;
        bridge.setSource(sourceable2);
        bridge.method();
    }
}