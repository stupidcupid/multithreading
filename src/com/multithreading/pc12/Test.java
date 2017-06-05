package com.multithreading.pc12;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class Test {

    public static void main(String[] args) throws  InterruptedException{

        Task task = new Task();

        MyThread1 myThread1= new MyThread1(task);
        myThread1.start();

        Thread.sleep(100);
        MyThread2 myThread2 = new MyThread2(task);
        myThread2.start();
    }
}
