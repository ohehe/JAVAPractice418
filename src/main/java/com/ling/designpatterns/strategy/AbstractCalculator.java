package com.ling.designpatterns.strategy;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 抽象的计算辅助类
 *
 * @author Administrator
 * @create 2017-04-24 11:02
 */
public abstract class AbstractCalculator {
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt) ;
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]) ;
        arrayInt[1] = Integer.parseInt(array[1]) ;
        return arrayInt ;
    }

}
