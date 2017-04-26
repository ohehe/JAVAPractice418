package com.ling.designpatterns.interpreter;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 上下文类
 *
 * @author Administrator
 * @create 2017-04-25 19:58
 */
public class Context {
    private int num1 ;
    private int num2 ;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1(){
        return num1 ;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
