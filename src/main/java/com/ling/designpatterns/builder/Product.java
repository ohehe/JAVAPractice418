package com.ling.designpatterns.builder;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 产品类
 *
 * @author Administrator
 * @create 2017-04-19 20:02
 */
public class Product {
    /**产品上A组件*/
    private String partA;

    /** 产品上B组件 */
    private String partB ;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }
}
