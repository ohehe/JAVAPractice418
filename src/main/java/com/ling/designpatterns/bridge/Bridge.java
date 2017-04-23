package com.ling.designpatterns.bridge;/**
 * Created by Administrator on 2017/4/23.
 */

/**
 * 抽象的桥接类
 *
 * @author Administrator
 * @create 2017-04-23 21:15
 */
public abstract class Bridge {
    private Sourceable source ;

    public void method(){
        source.method();
    }

    public Sourceable getSource(){
        return source ;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
