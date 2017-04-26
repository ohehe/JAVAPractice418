package com.ling.designpatterns.state;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 状态类
 *
 * @author Administrator
 * @create 2017-04-25 20:42
 */
public class State {
    private String value ;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("execute the first opt!");
    }

    public void method2(){
        System.out.println("execute the second opt!");
    }
}
