package com.ling.designpatterns.factory.factorymeshodpattern;

import com.ling.designpatterns.factory.simplefactory.Sender;
import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/19.
 */
public class SendFactoryTest extends TestCase {

    public void testProduceMail() throws Exception {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }

    public void testProduceSms() throws Exception {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceSms() ;
        sender.send();
    }
}