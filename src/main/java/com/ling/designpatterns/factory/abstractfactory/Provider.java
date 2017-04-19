package com.ling.designpatterns.factory.abstractfactory;/**
 * Created by Administrator on 2017/4/19.
 */

import com.ling.designpatterns.factory.simplefactory.Sender;

/**
 * 对抽象工厂的接口
 *
 * @author Administrator
 * @create 2017-04-19 13:06
 */
public interface Provider {
    /**
     * method:produce
     * @description 为工厂实现统一的接口 produce
     * @param
     * @return com.ling.designpatterns.factory.simplefactory.Sender
     * @throws
     *
     * @author Administrator
     * @date 2017/4/19
     */
    public Sender produce();
}
