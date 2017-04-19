package com.ling.designpatterns.singleton;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/19.
 */
public class ShadowInstanceUpdatePropTest extends TestCase {

    public void testGetInstance() throws Exception {
        ShadowInstanceUpdateProp shadowInstanceUpdateProp1 = ShadowInstanceUpdateProp.getInstance() ;
        ShadowInstanceUpdateProp shadowInstanceUpdateProp2 = ShadowInstanceUpdateProp.getInstance() ;
        assertEquals(shadowInstanceUpdateProp1.hashCode(),shadowInstanceUpdateProp2.hashCode());
    }
}