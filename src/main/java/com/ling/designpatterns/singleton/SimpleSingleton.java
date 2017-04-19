package com.ling.designpatterns.singleton;/**
 * Created by Administrator on 2017/4/19.
 */

/**
 * 简单有缺陷的单例类
 *
 * @author Administrator
 * @create 2017-04-19 13:23
 */
public class SimpleSingleton {

    /**
     * 赋值为null 实现延迟加载的目的
     */
    private static SimpleSingleton instance = null ;

    /**
     * method:SimpleSingleton
     * @description 私有化构造方法 防止实例化
     * @param
     * @return
     * @throws
     *
     * @author
     * @date
     */
    private SimpleSingleton(){

    }

    /**
     * method:getInstance
     * @description 获取单个实例
     * @param
     * @return com.ling.designpatterns.singleton.SimpleSingleton
     * @throws
     *
     * @author Administrator
     * @date 2017/4/19
     */
    public static SimpleSingleton getInstance() {

        if (instance == null){
            instance = new SimpleSingleton() ;
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
        return instance ;
    }
}
