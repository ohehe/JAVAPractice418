package com.ling.designpatterns.chainOfResponsibility;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * @author Administrator
 * @create 2017-04-25 14:48
 */
public abstract class AbstractHandler {
    private Handler handler ;

    public Handler getHandler(){
        return handler ;
    }

    public void setHandler(Handler handler){
        this.handler = handler ;
    }
}
