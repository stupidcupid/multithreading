package com.multithreading.pc2;

/**
 * Created by nanzhou on 2017/5/25.
 */
public class MyThread extends Thread{

    public MyThread(){

        System.out.println("构造方法" + Thread.currentThread().getName());
    }

    @Override
    public void run(){

        System.out.println("run方法" + Thread.currentThread().getName());
    }

    public static void main(String[] args ){

        MyThread myThread = new MyThread();
        //myThread.run();
        myThread.start();

    }

}
