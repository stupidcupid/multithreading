package com.multithreading.pc70;

import com.multithreading.pc68.MyObject;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println(MyObject.getInstance().hashCode());
    }
}
