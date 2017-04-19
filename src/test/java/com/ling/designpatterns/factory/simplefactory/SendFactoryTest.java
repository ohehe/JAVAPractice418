package com.ling.designpatterns.factory.simplefactory;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/19.
 */
public class SendFactoryTest extends TestCase {

    /**
     * method:testProduce
     * @description
     * @param
     * @return void
     * @throws
     *
     * @author Administrator
     * @date 2017/4/19
     */
    public void testProduce() throws Exception {
        SendFactory factory = new SendFactory() ;
        Sender sender = factory.produce("sms") ;
        sender.send();
    }
}