package com.ling.designpatterns.iterator;/**
 * Created by Administrator on 2017/4/24.
 */


/**
 * 集合的接口
 *
 * @author Administrator
 * @create 2017-04-24 15:06
 */
public interface Collection {
    public Iterator iterator() ;

    /**
     * 取得集合成员
     * @param i
     * @return
     */
    public Object get(int i) ;

    /**
     * 取得集合大小
     * @return
     */
    public int size() ;
}
