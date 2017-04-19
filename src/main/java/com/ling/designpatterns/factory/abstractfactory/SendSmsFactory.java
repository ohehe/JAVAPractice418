package com.ling.designpatterns.factory.abstractfactory;/**
 * Created by Administrator on 2017/4/19.
 */

import com.ling.designpatterns.factory.simplefactory.Sender;
import com.ling.designpatterns.factory.simplefactory.SmsSender;

/**
 * 实现工厂2
 *
 * @author Administrator
 * @create 2017-04-19 13:08
 */
public class SendSmsFactory implements  Provider{
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
        return new SmsSender() ;
    }
}
