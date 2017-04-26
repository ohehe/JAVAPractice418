package com.ling.designpatterns.memento;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 存储备忘录的类
 *
 * @author Administrator
 * @create 2017-04-25 20:24
 */
public class Storage {
    private Memento memento ;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
