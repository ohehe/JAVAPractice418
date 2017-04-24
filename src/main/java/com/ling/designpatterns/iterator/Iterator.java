package com.ling.designpatterns.iterator;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 迭代器
 *
 * @author Administrator
 * @create 2017-04-24 20:28
 */
public interface Iterator {
    public Object previous() ;
    public Object next() ;
    public boolean hasNext()  ;
    public Object first() ;
}
