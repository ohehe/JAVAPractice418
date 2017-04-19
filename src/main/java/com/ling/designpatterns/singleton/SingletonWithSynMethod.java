package com.ling.designpatterns.singleton;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 因为只需在创建类的时候同步，将创建部分和getInstance分开
 *
 * @author Administrator
 * @create 2017-04-19 14:57
 */
public class SingletonWithSynMethod {
    private static SingletonWithSynMethod instance = null ;

    /**
     * method:SingletonWithSynMethod
     * @description
     * @param
     * @return
     * @throws
     *
     * @author
     * @date
     */
    private SingletonWithSynMethod() {

    }
    /**
     * method:syncInit
     * @description 把创建和getInstance隔离开
     * @param
     * @return void
     * @throws
     *
     * @author Administrator
     * @date 2017/4/19
     */
    private static synchronized void syncInit(){

        if(instance == null){
            instance = new SingletonWithSynMethod() ;
        }

    }
    /**
     * method:getInstance
     * @description 获得单例
     * @param
     * @return com.ling.designpatterns.singleton.SingletonWithSynMethod
     * @throws
     *
     * @author Administrator
     * @date 2017/4/19
     */
    public static SingletonWithSynMethod getInstance(){

        if(instance == null){
            syncInit();
        }
        return instance ;
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
