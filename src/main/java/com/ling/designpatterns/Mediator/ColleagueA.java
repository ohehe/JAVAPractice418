package com.ling.designpatterns.Mediator;/**
 * Created by Administrator on 2017/4/26.
 */

/**
 * 同事类A
 *
 * @author Administrator
 * @create 2017-04-26 10:50
 */
public class ColleagueA extends AbstractColleague{


    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.AaffectB();
    }
}
