package com.multithreading.pc73;

/**
 * Created by nanzhou on 2017/6/30.
 */
public class MyThread extends Thread {

    private Object lock;

    private String showCar;

    private int showNumPosition;

    private int printCount;

    volatile private static int addNumber = 1;

    public MyThread(Object lock, String showCar, int showNumPosition) {
        super();
        this.lock = lock;
        this.showCar = showCar;
        this.showNumPosition = showNumPosition;
    }

    @Override
    public void run() {

        try {
            synchronized (lock) {

                while (true) {

                    if (addNumber % 4 == showNumPosition) {

                        System.out.println("ThreadName " + Thread.currentThread().getName() + " runCount " + addNumber + " " + showCar);
                        lock.notifyAll();
                        addNumber++;
                        printCount++;
                        if (printCount == 10) {
                            break;
                        }
                    } else {
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
