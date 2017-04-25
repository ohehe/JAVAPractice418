package com.ling.designpatterns.command;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 命令
 *
 * @author Administrator
 * @create 2017-04-25 17:10
 */
public class UpperCommand implements Command {
    private Receiver receiver ;

    public UpperCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
