package com.multithreading.pc13;

/**
 * Created by nanzhou on 2017/6/2.
 */
public class Test {

    public static void main(String[] args) {

        Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");

        threadB.start();
    }
}
