package com.multithreading.pc71;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class MyObject {

    private static MyObject instance = null;

    private MyObject()
    {

    }

    static {

        instance = new MyObject();
    }

    public static MyObject getInstance() {

        return instance;
    }

}
