package com.ling.designpatterns.visitor;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * @author Administrator
 * @create 2017-04-25 21:19
 */
public class MyVisitor implements Visitor{
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
