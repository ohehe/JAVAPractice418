package com.ling.designpatterns.factory.abstractfactory;

import com.ling.designpatterns.factory.simplefactory.Sender;
import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/19.
 */
public class SendSmsFactoryTest extends TestCase {

    public void testProduce() throws Exception {
        Provider provider = new SendSmsFactory() ;
        Sender sender = provider.produce() ;
        sender.send();
    }
}