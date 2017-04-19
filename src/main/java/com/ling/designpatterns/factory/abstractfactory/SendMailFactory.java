package com.ling.designpatterns.factory.abstractfactory;/**
 * Created by Administrator on 2017/4/19.
 */

import com.ling.designpatterns.factory.simplefactory.MailSender;
import com.ling.designpatterns.factory.simplefactory.Sender;

/**
 * 实现工厂1
 *
 * @author Administrator
 * @create 2017-04-19 13:13
 */
public class SendMailFactory implements Provider{
    /**
     * method:produce
     *
     * @return com.ling.designpatterns.factory.simplefactory.Sender
     * @throws
     * @description 为工厂实现统一的接口 produce
     * @author Administrator
     * @date 2017/4/19
     */
    @Override
    public Sender produce() {
        return new MailSender() ;
    }
}
