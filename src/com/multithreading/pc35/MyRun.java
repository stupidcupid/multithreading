package com.multithreading.pc35;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class MyRun {

    private String lock = new String("");

    private boolean isFirstRunB = false;

    private  Runnable runnableA = new Runnable() {

        @Override
        public void run() {

            try {
                synchronized (lock) {
                    while(isFirstRunB == false){

                        System.out.println(" begin wait ");
                        lock.wait();
                        System.out.println(" end wait");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB = new Runnable() {

        @Override
        public void run() {

            synchronized (lock) {
                System.out.println(" begin notify ");
                lock.notify();
                System.out.println(" end notify");
                isFirstRunB = true;
            }
        }
    };

    public static void main(String[] args) throws  InterruptedException{

        MyRun run = new MyRun();

        Thread threadA = new Thread(run.runnableA);
        threadA.start();

        Thread.sleep(100);

        Thread threadB = new Thread(run.runnableB);
        threadB.start();



    }
}