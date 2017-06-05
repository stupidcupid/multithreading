package com.multithreading.pc1;



/**
 * Created by nanzhou on 2017/5/25.
 */
public class MyThread extends  Thread{

    private int count = 5;


    @Override
    public synchronized void run(){

        super.run();
            count --;
            System.out.println("由" + Thread.currentThread().getName() + "计算，count = " + count);

    }

    public static void main(String[] args){

        MyThread myThread = new MyThread();

        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");


        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }

}
