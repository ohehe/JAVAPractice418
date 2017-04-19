package com.ling.designpatterns.builder;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 产品1
 *
 * @author Administrator
 * @create 2017-04-19 20:13
 */
public class ProductV1 extends ProductBuilder{
    @Override
    public void buildPartA() {
        product.setPartA("coffee");
    }

    @Override
    public void buildPartB() {
        product.setPartB("rice");
    }
}
