package com.multithreading.pc27;

/**
 * Created by nanzhou on 2017/6/7.
 */
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {

        super();
        this.lock = lock;
    }

    @Override
    public void run() {

        try {

            synchronized (lock){

                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        lock.notify();
                        System.out.println("已发出通知");
                    }
                    System.out.println("已添加 " + (i + 1) + "个元素 ");
                    Thread.sleep(1000);
                }
            }

        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
