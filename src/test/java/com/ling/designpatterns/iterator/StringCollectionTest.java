package com.ling.designpatterns.iterator;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/24.
 */
public class StringCollectionTest extends TestCase {

    public void testIterator() throws Exception {
        Collection collection = new StringCollection() ;
        Iterator iterator = collection.iterator() ;
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}