package com.ling.designpatterns.visitor;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 数据结构类
 *
 * @author Administrator
 * @create 2017-04-25 21:17
 */
public interface Subject {
    public void accept(Visitor visitor);

    /**
     * 获取将要访问的属性
     * @return
     */
    public String getSubject();
}
