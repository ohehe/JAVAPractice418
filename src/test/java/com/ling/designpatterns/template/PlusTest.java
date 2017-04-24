package com.ling.designpatterns.template;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/24.
 */
public class PlusTest extends TestCase {

    public void testCalculate() throws Exception {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}