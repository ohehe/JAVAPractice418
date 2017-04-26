package com.ling.designpatterns.Mediator;/**
 * Created by Administrator on 2017/4/26.
 */

/**
 * 抽象同事类
 *
 * @author Administrator
 * @create 2017-04-26 10:45
 */
public abstract class AbstractColleague {
    protected int number ;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void setNumber(int number, AbstractMediator am) ;
}

