package com.multithreading.pc51;

/**
 * Created by nanzhou on 2017/6/23.
 */
public class Run {

    /**
     * 值继承
     * notice :
     *   如果在子线程在取得值得同事 主线程将InheritableThreadLocal的值进行修改 子线程的到的值还是原来的值
     */
    public static void main(String[] args) throws InterruptedException{

        for (int i = 0; i < 10; i++) {

            System.out.println("Main getValue " + Tools.t1.get());
            Thread.sleep(100);
        }
        Thread.sleep(1000);
        ThreadA a = new ThreadA();
        a.start();
    }
}
