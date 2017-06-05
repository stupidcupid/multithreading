package com.multithreading.pc15;

/**
 * Created by nanzhou on 2017/6/5.
 */
public class Run1_1 {

    /**
     * 当多个线程同时执行synchronize(x){}同步代码块时成同步效果
     */
    public static void main(String[] args) {
        Service service = new Service();

        Myproject myproject = new Myproject();

        ThreadA a  = new ThreadA(service,myproject);
        a.setName("A");
        a.start();

        ThreadB  b  = new ThreadB(service,myproject);
        b.setName("B");
        b.start();

    }
}
