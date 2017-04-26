package com.ling.designpatterns.visitor;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * @author Administrator
 * @create 2017-04-25 21:26
 */
public class MySubject implements Subject{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 获取将要访问的属性
     *
     * @return
     */
    @Override
    public String getSubject() {
        return "love";
    }
}
