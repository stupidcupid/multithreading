package com.multithreading.pc70;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class MyObject {

    private static class MyObjectHandel{

        private static MyObject myObject = new MyObject();
    }

    public static MyObject getIntance(){

        return MyObjectHandel.myObject;
    }
}
