package com.multithreading.pc3;


/**
 * Created by nanzhou on 2017/5/25.
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("run = " + this.isAlive());
    }

    public static void main(String[] args) {


        /**
         * TODO
         */
        MyThread myThread = new MyThread();
        System.out.println("begin = " + myThread.isAlive());
        myThread.start();
        System.out.println("end = " + myThread.isAlive());
    }

}
