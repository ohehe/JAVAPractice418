package com.ling.designpatterns.builder;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/19.
 */
public class ClientTest extends TestCase {

    public void testBuyProductV1() throws Exception {
        Client client = new Client() ;
        client.buyProductV1();
    }

    public void testBuyProductV2() throws Exception {
        Client client = new Client() ;
        client.buyProductV2();
    }
}