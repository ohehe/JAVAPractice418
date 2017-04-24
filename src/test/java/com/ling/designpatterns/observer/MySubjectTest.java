package com.ling.designpatterns.observer;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/24.
 */
public class MySubjectTest extends TestCase {

    public void testOperation() throws Exception {
        Subject subject = new MySubject() ;
        subject.add(new Observer1());
        subject.add(new Observer2());

        subject.operation();
    }
}