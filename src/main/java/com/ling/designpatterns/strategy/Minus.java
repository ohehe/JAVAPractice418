package com.ling.designpatterns.strategy;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 减法
 *
 * @author Administrator
 * @create 2017-04-24 11:32
 */
public class Minus extends AbstractCalculator implements ICalculator{

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}
