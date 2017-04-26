package com.ling.designpatterns.Mediator;/**
 * Created by Administrator on 2017/4/25.
 */

/**
 * 中介者类
 *抽象中介者：定义好同事类对象到中介者对象的接口，用于各个同事类之间的通信。一般包括一个或几个抽象的事件方法，并由子类去实现。
 *中介者实现类：从抽象中介者继承而来，实现抽象中介者中定义的事件方法。从一个同事类接收消息，然后通过消息影响其他同时类。
 *同事类：如果一个对象会影响其他的对象，同时也会被其他对象影响，那么这两个对象称为同事类。在类图中，同事类只有一个，
 * 这其实是现实的省略，在实际应用中，同事类一般由多个组成，他们之间相互影响，相互依赖。同事类越多，关系越复杂。并且，同事类也可以表现为继承了同一个抽象类的一组实现组成。在中介者模式中，同事类之间必须通过中介者才能进行消息传递。
 * @author Administrator
 * @create 2017-04-25 21:31
 */
public class Mediator extends AbstractMediator{

    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
        A = a ;
        B = b ;
    }

    @Override
    public void AaffectB() {
        int number = A.getNumber() ;
        B.setNumber(number*100);
    }

    @Override
    public void BaffectA() {
        int number = B.getNumber() ;
        A.setNumber(number/100);
    }
}
