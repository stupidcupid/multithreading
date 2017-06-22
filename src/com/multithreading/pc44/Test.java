package com.multithreading.pc44;

/**
 * Created by nanzhou on 2017/6/21.
 */
public class Test {

    public static void main(String[] args) {

        try {
            MyThread myThreadTest = new MyThread();
            myThreadTest.start();
            myThreadTest.join();
            System.out.println(myThreadTest.getState());
            System.out.println("myThreadTest对象 执行完毕 后再执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
