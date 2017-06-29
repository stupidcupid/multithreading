package com.multithreading.pc68;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println(MyObject.getInstance().hashCode());
    }
}
