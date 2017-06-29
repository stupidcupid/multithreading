package com.multithreading.pc66;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class Run {

    /**
     * ReentrantReadWriteLock 读读共享 写写互斥 写读互斥 读写互斥
     * @param args
     */
    public static void main(String[] args) {

        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("AAAAA");
        threadA.start();

        ThreadB threadB = new ThreadB(service);
        threadB.setName("BBBBB");
        threadB.start();


        ThreadC threadC = new ThreadC(service);
        threadC.setName("CCCCC");
        threadC.start();

        ThreadD threadD = new ThreadD(service);
        threadD.setName("CCCCC");
        threadD.start();

    }
}
