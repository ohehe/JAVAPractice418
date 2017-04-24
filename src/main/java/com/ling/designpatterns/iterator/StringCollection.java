package com.ling.designpatterns.iterator;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 字符集合类
 *
 * @author Administrator
 * @create 2017-04-24 21:01
 */
public class StringCollection implements Collection{

    public String stringArr[] = {"a","b","c","d"} ;

    @Override
    public Iterator iterator() {
        return new StringIterator(this);
    }

    /**
     * 取得集合成员
     *
     * @param i
     * @return
     */
    @Override
    public Object get(int i) {
        return stringArr[i];
    }

    /**
     * 取得集合大小
     *
     * @return
     */
    @Override
    public int size() {
        return stringArr.length;
    }
}
