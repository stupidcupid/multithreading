package com.multithreading.pc18;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class Service {

    Object obj1 = new Object();

    public void methodA() {

        synchronized (obj1) {
            System.out.println("begin methodA");
            boolean flag = true;
            while (flag) {

            }
            System.out.println("end methodA");
        }
    }

    Object obj2 = new Object();

    public void methodB() {
        synchronized (obj2) {
            System.out.println("begin method");
            System.out.println("end methodA");
        }

    }
}
