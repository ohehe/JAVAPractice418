package com.ling.designpatterns.Prototype;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017/4/19.
 */
public class PrototypeTest extends TestCase {

    /*
    "abc"---------存储的地方叫常量字符串池，是共享字符串的；
    new String("abc")对象-------------存放在堆;
    S1，S2，S3，S4--------------引用在栈内存中；
    String 类创建的时候，检查字符串"abc"是否在pool中已经存在，存在的话就会共享。
    String S1=new String("abc");做了以下动作：
    1 定义一个S1引用，指向对象new String("abc")；
    2 而对象new String("abc")，又使用了常量字符串池中的"abc"，也可以说指向；
    ----------------------------------------
    String S2="abc";
    定义一个S2引用，指向常量字符串池的"abc"；[有存在的就共享]
    String S3="abc";
    定义一个S3引用，指向常量字符串池的"abc"；[有存在的就共享]
    String S4=new String("abc");
    1 定义一个S4引用，指向对象new String("abc")；这会在堆内存中再开一个对象，此对象也是志向常量池中的"abc"；但对象各是各，它们的堆内存地址可不样。
    -----------------------------------------------
    再明确一点就是：==比较的是内存地址，栈内存中的引用存放的内容就是其所志向的对象的堆内存地址，也就是S1,2,3,4[可以这么理解]
    这样看来；S2==S3不用说了；S1,S4的内存地址也不一样；
    */

    public void testDeepClone() throws Exception {
        Prototype prototypeOrignal = new Prototype() ;
        prototypeOrignal.setString("lingran");
        prototypeOrignal.setObj(new SerializableObject());

        Prototype prototypeByDeepClone = (Prototype) prototypeOrignal.deepClone() ;
        assertNotSame(prototypeOrignal , prototypeByDeepClone);
        //这里没有卵用的 内部实现是用的== 比较内存地址 只要不是同个对象都是不相等
        assertNotSame(prototypeOrignal.getString() , prototypeByDeepClone.getString());
        assertNotSame(prototypeOrignal.getObj(), prototypeByDeepClone.getObj());

        //这里string的hashcode仅仅表示字符串内容算出哈希值相等 会有冲突现象 "gdejicbegh"与字符串"hgebcijedg"
        System.out.println("orignal hashcode:"+prototypeOrignal.hashCode()+"----"+"after hashcode:"+prototypeByDeepClone.hashCode()
        +"\norignal-string hashcode:"+prototypeOrignal.getString().hashCode()+"----"+"after-string hashcode:"+prototypeByDeepClone.getString().hashCode()
        +"\norignal-obj hashcode:"+prototypeOrignal.getObj().hashCode()+"----"+"after-obj hashcode:"+prototypeByDeepClone.getObj().hashCode()
       );



    }
}