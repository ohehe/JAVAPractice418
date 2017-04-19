package com.ling.designpatterns.factory.simplefactory;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 实现类1
 *
 * @author Administrator
 * @create 2017-04-19 11:35
 */
public class MailSender implements Sender {

    /**
     * method: send
     *
     * @throws
     * @retur
     * @descripion 统一的send接口
     * @author Administrator
     * @date 2017/4/19
     */
    public void send() {
        System.out.println("now using MailSender");
    }
}
