package com.multithreading.pc17;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class Run {


    /**
     *
     * JVM具有String常量池缓存的功能 synchronized一般不适用String作为锁对象
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
