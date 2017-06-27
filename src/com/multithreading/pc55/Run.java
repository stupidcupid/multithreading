package com.multithreading.pc55;

/**
 * Created by nanzhou on 2017/6/27.
 */
public class Run
{
    public static void main(String[] args) throws InterruptedException{

        Myservice myservice = new Myservice();

        ThreadA  threadA = new ThreadA(myservice);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(myservice);
        threadB.setName("B");
        threadB.start();

        Thread.sleep(3000);

        myservice.singalAll_A();

    }
}
