package com.ling.designpatterns.strategy;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 加法
 *
 * @author Administrator
 * @create 2017-04-24 11:28
 */
public class Plus extends AbstractCalculator implements ICalculator{

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+") ;
        return arrayInt[0]+arrayInt[1] ;
    }
}
