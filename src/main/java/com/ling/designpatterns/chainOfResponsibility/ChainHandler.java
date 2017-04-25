package com.ling.designpatterns.chainOfResponsibility;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 责任链
 *
 * @author Administrator
 * @create 2017-04-25 16:50
 */
public class ChainHandler extends AbstractHandler implements Handler {
    private String name ;

    public ChainHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+":deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
