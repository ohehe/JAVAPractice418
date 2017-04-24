package com.ling.designpatterns.iterator;/**
 * Created by Administrator on 2017/4/24.
 */

/**
 * 字符迭代器
 *
 * @author Administrator
 * @create 2017-04-24 21:05
 */
public class StringIterator implements Iterator {
    private Collection collection ;

    private int pos = -1;
    public StringIterator(Collection collection) {
        this.collection = collection ;
    }

    @Override
    public Object previous() {
        if(pos > 0 ){
            pos-- ;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if(pos<collection.size()-1){
            ++pos ;
        }
        return collection.get(pos) ;
    }

    @Override
    public boolean hasNext() {
        if(pos<collection.size()-1){
            return true ;
        }else{
            return false ;
        }
    }

    @Override
    public Object first() {
        pos = 0 ;
        return collection.get(pos) ;
    }
}
