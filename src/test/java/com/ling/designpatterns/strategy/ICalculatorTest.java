package com.ling.designpatterns.strategy;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/24.
 */
public class ICalculatorTest extends TestCase {

    public void testCalculate() throws Exception {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}