package com.ling.designpatterns.chainOfResponsibility;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/25.
 */
public class ChainHandlerTest extends TestCase {

    public void testOperator() throws Exception {
        ChainHandler handler1 = new ChainHandler("1") ;
        ChainHandler handler2 = new ChainHandler("2") ;
        ChainHandler handler3 = new ChainHandler("3") ;

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler1.operator();
    }
}