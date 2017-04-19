package com.ling.designpatterns.builder;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 抽象构造器
 *
 * @author Administrator
 * @create 2017-04-19 20:04
 */
abstract class ProductBuilder {
    Product product = new Product() ;

    public abstract void buildPartA() ;

    public abstract void buildPartB() ;

    public Product getProduct(){
        return product ;
    }
}
