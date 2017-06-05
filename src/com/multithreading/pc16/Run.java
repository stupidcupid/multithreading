package com.multithreading.pc16;


/**
 * Created by nanzhou on 2017/6/5.
 */
public class Run {

    /**
     *
     * 当其他线程执行x对象synchronized同步方法时呈同步效果
     */
    public static void main(String[] args) throws InterruptedException {


        Service service = new Service();

        MyProject myproject = new MyProject();

        ThreadA a = new ThreadA(service, myproject);
        a.setName("A");
        a.start();
        Thread.sleep(100);

        ThreadB b = new ThreadB(myproject);
        b.setName("B");
        b.start();


    }
}
