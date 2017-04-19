package com.ling.designpatterns.factory.simplefactory;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 工厂类
 *
 * @author Administrator
 * @create 2017-04-19 11:44
 */
public class SendFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender() ;
        }else if("sms".equals(type)){
            return new SmsSender() ;
        }
        return null ;
    }
}
