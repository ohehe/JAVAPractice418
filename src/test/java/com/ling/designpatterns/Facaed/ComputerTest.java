package com.ling.designpatterns.Facaed;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/23.
 */
public class ComputerTest extends TestCase {

    public void testStartUp() throws Exception {
        Computer computer = new Computer();
        computer.startUp();
    }

    public void testShutDown() throws Exception {
        Computer computer = new Computer();
        computer.shutDown();
    }
}