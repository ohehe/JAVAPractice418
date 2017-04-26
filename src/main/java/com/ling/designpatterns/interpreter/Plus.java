package com.ling.designpatterns.interpreter;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 加法
 *
 * @author Administrator
 * @create 2017-04-25 20:00
 */
public class Plus implements Expression{
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
