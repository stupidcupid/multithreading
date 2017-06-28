package com.multithreading.pc58;

/**
 * Created by nanzhou on 2017/6/28.
 */
public class RunFair {

    public static void main(String[] args) {


        /**
         * 公平锁 非公平锁
         */
        final Service service = new Service(true);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                System.out.println("线程 " + Thread.currentThread().getName() + "运行了 ");
                service.serviceMethod();
            }
        };
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {

            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {

            threads[i].start();
        }

    }
}
