package com.multithreading.pc21;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class Run1 {

    public static void main(String[] args) {

        MyService myService = new MyService();
        ThreadA threadA = new ThreadA(myService);
        threadA.setName("A");

        ThreadB threadB = new ThreadB(myService);
        threadB.setName("B");

        threadA.start();
        threadB.start();


    }
}
