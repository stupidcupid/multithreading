package com.multithreading.pc54;

/**
 * Created by nanzhou on 2017/6/27.
 */
public class Run {


    /**
     *
     * await wait    notify notifyAll  singal
     */
    public static void main(String[] args) throws InterruptedException {

        Myservice myservice = new Myservice();
        ThreadA threadA = new ThreadA(myservice);

        threadA.start();

        Thread.sleep(3000);

        myservice.signal();
    }
}
