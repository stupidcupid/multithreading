package com.multithreading.pc26;

/**
 * Created by nanzhou on 2017/6/7.
 */
public class Run {

    public static void main(String[] args) {


        try {
            MyService myService = new MyService();
            MyThread[] array = new MyThread[5];

            for (int i = 0; i < array.length; i++) {
                array[i] = new MyThread(myService);

            }
            for (int i = 0; i < array.length; i++) {
                array[i].start();

            }
            Thread.sleep(1000);
            System.out.println(myService.aiRef.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
