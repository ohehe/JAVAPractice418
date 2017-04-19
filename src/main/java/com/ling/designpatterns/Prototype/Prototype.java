package com.ling.designpatterns.Prototype;/**
 * Created by Administrator on 2017/4/19.
 */

import java.io.*;

/**
 * 原型模式
 * 将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 *浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 *深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 * @author Administrator
 * @create 2017-04-19 20:56
 */
public class Prototype implements Cloneable,Serializable {
    private static final long serialVersioonUID = 1L ;
    private String string ;

    private SerializableObject obj ;
    /**
     * method:clone
     * @description 实现浅拷贝
     * @param
     * @return java.lang.Object
     * @throws CloneNotSupportedException
     *
     * @author Administrator
     * @date 2017/4/19
     */
    public Object clone() throws CloneNotSupportedException {

        return (Prototype)super.clone();
    }
    /**
     * method:deepClone
     * @description 深拷贝
     * @param
     * @return java.lang.Object
     * @throws IOException, ClassNotFoundException
     *
     * @author Administrator
     * @date 2017/4/19
     */
    public Object deepClone() throws IOException, ClassNotFoundException{
        //写出当前对象的二进制流 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream() ;
        ObjectOutputStream oos = new ObjectOutputStream(bos) ;
        oos.writeObject(this);

        //读入二进制流产生对象 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray()) ;
        ObjectInputStream ois = new ObjectInputStream(bis) ;
        return ois.readObject() ;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}
