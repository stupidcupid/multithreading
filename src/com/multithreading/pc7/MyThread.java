package com.multithreading.pc7;

/**
 * Created by nanzhou on 2017/5/31.
 */
public class MyThread extends Thread {

    @Override
    public void run(){

        Sub sub = new Sub();
        sub.operateISubMethod();
        //哪儿来的野鸡在给自己加戏呢？

    }

}
