package com.ling.designpatterns.memento;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 原始类
 *
 * @author Administrator
 * @create 2017-04-25 20:30
 */
public class Original {
    private String value ;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value) ;
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue() ;
    }
}
