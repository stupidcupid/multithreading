package com.multithreading.pc11;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class Test {

    public static void main(String[] args) {

        ObjectService objectService = new ObjectService();

        ThreadA threadA = new ThreadA(objectService);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(objectService);
        threadB.setName("B");
        threadB.start();
    }
}
