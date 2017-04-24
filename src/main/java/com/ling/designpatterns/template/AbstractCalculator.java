package com.ling.designpatterns.template;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 抽象的模板类
 *
 * @author Administrator
 * @create 2017-04-24 13:40
 */
public abstract class AbstractCalculator {
    /**
     * 被子类重写的实际计算方法
     * @param num1
     * @param num2
     * @return int
     */
    abstract int calculate(int num1,int num2) ;

    /**
     * 计算字符串分割
     * @param exp
     * @param opt
     * @return
     */
    public int[] split(String exp, String opt){
        String array[] = exp.split(opt) ;
        int arrayInt[] = new int[2] ;
        arrayInt[0] = Integer.parseInt(array[0]) ;
        arrayInt[1] = Integer.parseInt(array[1]) ;
        return arrayInt ;
    }

    /**
     * 计算 主方法
     * @param exp
     * @param opt
     * @return int
     */
    public final int calculate(String exp,String opt){
        int array[] = split(exp,opt) ;
        return calculate(array[0],array[1]) ;
    }
}
