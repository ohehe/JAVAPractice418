package com.ling.designpatterns.Prototype;/**
 * Created by Administrator on 2017/4/19.
 */

import java.io.Serializable;

/**
 * 序列化类
 *
 * @author Administrator
 * @create 2017-04-19 21:41
 */
public class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
