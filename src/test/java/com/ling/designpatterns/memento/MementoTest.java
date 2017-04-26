package com.ling.designpatterns.memento;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/25.
 */
public class MementoTest extends TestCase {

    public void testGetValue() throws Exception {

        //创建原始类
        Original original = new Original("original") ;

        //创建备忘录
        Storage storage = new Storage(original.createMemento()) ;

        // 修改原始类的状态
        System.out.println("初始化状态为：" + original.getValue());
        original.setValue("niu");
        System.out.println("修改后的状态为：" + original.getValue());

        // 回复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + original.getValue());
    }
}