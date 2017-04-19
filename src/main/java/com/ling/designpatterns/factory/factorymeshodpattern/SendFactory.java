package com.ling.designpatterns.factory.factorymeshodpattern;/**
 * Created by Administrator on 2017/4/19.
 */

import com.ling.designpatterns.factory.simplefactory.MailSender;
import com.ling.designpatterns.factory.simplefactory.Sender;
import com.ling.designpatterns.factory.simplefactory.SmsSender;

/**
 * 多个工厂方法的实现模式
 *
 * @author Administrator
 * @create 2017-04-19 12:36
 */
public class SendFactory {
    public Sender produceMail(){
        return new MailSender() ;
    }
    public Sender produceSms(){
        return new SmsSender() ;
    }
}
