package com.ling.designpatterns.state;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/25.
 */
public class StateTest extends TestCase {

    public void testMethod() throws Exception {
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}