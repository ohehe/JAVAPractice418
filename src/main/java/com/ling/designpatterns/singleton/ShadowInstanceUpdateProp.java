package com.ling.designpatterns.singleton;/**
 * Created by Administrator on 2017/4/19.
 */

import java.util.Vector;

/**
 * 使用影子实例更新属性
 *
 * 具体说，就是在更新属性时，
 * 直接生成另一个单例对象实例，
 * 这个新生成的单例对象实例将从数据库或文件中读取最新的配置信息；
 * 然后将这些配置信息直接赋值给旧单例对象的属性。
 * @author Administrator
 * @create 2017-04-19 16:18
 */
public class ShadowInstanceUpdateProp {
    private static ShadowInstanceUpdateProp instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private ShadowInstanceUpdateProp() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new ShadowInstanceUpdateProp();
        }
    }

    public static ShadowInstanceUpdateProp getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties() {
        ShadowInstanceUpdateProp shadow = new ShadowInstanceUpdateProp();
        properties = shadow.getProperties();
    }
}
