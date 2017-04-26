package com.ling.designpatterns.visitor;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/25.
 */
public class MyVisitorTest extends TestCase {

    public void testVisit() throws Exception {
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}