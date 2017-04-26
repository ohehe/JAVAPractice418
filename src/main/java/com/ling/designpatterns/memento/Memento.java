package com.ling.designpatterns.memento;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 备忘录
 *
 * @author Administrator
 * @create 2017-04-25 20:22
 */
public class Memento {
    private String value ;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
