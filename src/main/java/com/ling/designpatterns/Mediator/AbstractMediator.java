package com.ling.designpatterns.Mediator;/**
 * Created by Administrator on 2017/4/26.
 */

/**
 * @author Administrator
 * @create 2017-04-26 10:59
 */
public abstract class AbstractMediator {
    protected AbstractColleague A;
    protected AbstractColleague B ;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }

    public abstract void AaffectB()  ;
    public abstract void BaffectA() ;

}
