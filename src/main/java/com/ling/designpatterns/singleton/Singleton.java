package com.ling.designpatterns.singleton;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 使用内部类来维护单例
 *
 * @author Administrator
 * @create 2017-04-19 13:52
 */
public class Singleton {

    /**
     * method:Singleton
     * @description 私有构造方法
     * @param
     * @return
     * @throws
     *
     * @author
     * @date
     */
    private Singleton(){

    }
    /**
     * Class : SingletonFactory
     * @Description: 使用一个内部类来维护单例，JVM中保证一个类加载的时候，加载过程是线程互斥的，所以只会创建一次
     * @author: Administrator
     * @Date: 2017/4/19
     **/
    private static class SingletonFactory{
        private static Singleton instance = new Singleton() ;
    }

    /**
     * method:getInstance
     * @description 获取单例
     * @param
     * @return com.ling.designpatterns.singleton.Singleton
     * @throws
     *
     * @author Administrator
     * @date 2017/4/19
     */
    public static Singleton getInstance(){

        return SingletonFactory.instance ;
    }
    /**
     * method:readResolve
     * @description 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     * @param
     * @return java.lang.Object
     * @throws
     *
     * @author Administrator
     * @date 2017/4/19
     */
    public Object readResolve(){

        return getInstance() ;
    }
}
