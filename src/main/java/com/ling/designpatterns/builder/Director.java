package com.ling.designpatterns.builder;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 导演类  决定生产何种产品 如何组装
 *
 * @author Administrator
 * @create 2017-04-19 20:16
 */
public class Director {
    private ProductBuilder productBuilder ;
    /**
     * method:setProductBuilder
     * @description 设置生产产品的构造器
     * @param productBuilder
     * @return void
     * @throws
     *
     * @author Administrator
     * @date 2017/4/19
     */
    public void setProductBuilder(ProductBuilder productBuilder){

        this.productBuilder = productBuilder ;
    }

    /**
     * method:construct
     * @description 配置产品构造流程 组装产品
     * @param
     * @return com.ling.designpatterns.builder.Product
     * @throws
     *
     * @author Administrator
     * @date 2017/4/19
     */
    public Product construct(){
        productBuilder.buildPartA();
        productBuilder.buildPartB();
        return productBuilder.getProduct() ;
    }
}
