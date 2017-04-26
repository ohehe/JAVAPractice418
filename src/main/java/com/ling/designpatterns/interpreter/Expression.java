package com.ling.designpatterns.interpreter;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 表达式接口
 *
 * @author Administrator
 * @create 2017-04-25 19:57
 */
public interface Expression {
    public int interpret(Context context) ;
}
