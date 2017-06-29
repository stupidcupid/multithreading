package com.multithreading.pc68;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class MyObject {

    private static MyObject myObject = new MyObject();

    private MyObject (){

    }

    public static MyObject getInstance(){

        //本版本为立即加载 缺点是不能有其他变量
        //因为getInstance() 方法没有同步 可能存在非线程安全的问题
        return myObject;
    }
}
