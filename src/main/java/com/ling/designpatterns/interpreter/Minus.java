package com.ling.designpatterns.interpreter;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 减法
 *
 * @author Administrator
 * @create 2017-04-25 20:01
 */
public class Minus implements Expression{
    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}
