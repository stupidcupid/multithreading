package com.multithreading.pc72;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class Run {

    /**
     * 线程对象关联线程组 多级关联
     * @param args
     */
    public static void main(String[] args) {


        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(mainGroup, "A");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println("Run method ");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread newThread = new Thread(group, runnable);
        newThread.setName("Z");
        newThread.start();

        ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup);

        System.out.println("Main 线程中有多少个线程组 " + listGroup.length + " Name " + listGroup[0].getName());

        Thread[] listThread = new Thread[listGroup[0].activeCount()];
        listGroup[0].enumerate(listThread);
        System.out.println(listThread[0].getName());
    }
}
