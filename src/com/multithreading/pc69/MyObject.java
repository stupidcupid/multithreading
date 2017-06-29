package com.multithreading.pc69;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class MyObject {

    private volatile static MyObject myObject;

    private MyObject() {

    }
    //使用双检测机制来解决问题 既保证了不需要同步代码的异步性
    //又保证了单例的效果

    public static MyObject getIntance() {

        if (null != myObject) {
        } else {

            synchronized (MyObject.class) {

                if (null == myObject) {

                    return new MyObject();
                }
            }
        }
        return myObject;
    }
}
