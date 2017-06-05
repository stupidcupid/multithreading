package com.multithreading.pc7;

/**
 * Created by nanzhou on 2017/5/31.
 */
public class Main {

    public int i = 10;

    public void operateMainMethod(){

        i -- ;
        System.out.println("main print i=" + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
