package com.multithreading.pc16;


/**
 * Created by nanzhou on 2017/6/5.
 */
public class MyProject {

    synchronized public void speedPrintString() {


        System.out.println("speedPrintString ____getLock time " +
                System.currentTimeMillis() + " run ThreadName time " + Thread.currentThread().getName());
        System.out.println("--------------------------------");
        System.out.println("speedPrintString release time " +
                System.currentTimeMillis() + " run ThreadName time " + Thread.currentThread().getName());

    }
}
