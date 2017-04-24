package com.ling.designpatterns.template;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 加法
 *
 * @author Administrator
 * @create 2017-04-24 13:54
 */
public class Plus extends AbstractCalculator{
    /**
     * 被子类重写的实际计算方法
     *
     * @param num1
     * @param num2
     * @return int
     */
    @Override
    int calculate(int num1, int num2) {
        return num1+num2;
    }
}
