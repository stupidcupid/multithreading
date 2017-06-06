package com.multithreading.pc18;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class Run {


    /**
     * 同步 synchronized 方法无限等待与解决
     */
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
