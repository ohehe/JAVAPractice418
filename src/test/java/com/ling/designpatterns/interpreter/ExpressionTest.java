package com.ling.designpatterns.interpreter;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/25.
 */
public class ExpressionTest extends TestCase {

    public void testInterpret() throws Exception {
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }

}