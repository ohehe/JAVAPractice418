package com.ling.designpatterns.command;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 命令调用者
 *
 * @author Administrator
 * @create 2017-04-25 17:15
 */
public class Invoker {
    private Command command ;
    public Invoker(Command command){
        this.command = command ;
    }

    public void action(){
        command.exe()  ;
    }
}
