package com.ling.designpatterns.builder;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 产品2
 *
 * @author Administrator
 * @create 2017-04-19 20:13
 */
public class ProductV2 extends ProductBuilder{
    @Override
    public void buildPartA() {
        product.setPartA("coco");
    }

    @Override
    public void buildPartB() {
        product.setPartB("apple");
    }
}
