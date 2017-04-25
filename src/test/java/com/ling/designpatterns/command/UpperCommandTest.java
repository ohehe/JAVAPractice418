package com.ling.designpatterns.command;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/25.
 */
public class UpperCommandTest extends TestCase {

    public void testExe() throws Exception {
        Receiver receiver = new Receiver();
        Command cmd = new UpperCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}