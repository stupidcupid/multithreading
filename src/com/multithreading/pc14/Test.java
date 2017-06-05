package com.multithreading.pc14;

/**
 * Created by nanzhou on 2017/6/2.
 */
public class Test {

    public static void main(String[] args) {


        try {
            MyOneList list = new MyOneList();


            MyThread1 myThread1 = new MyThread1(list);
            myThread1.setName("A");
            myThread1.start();

            MyThread2 myThread2 = new MyThread2(list);
            myThread2.setName("B");
            myThread2.start();
            Thread.sleep(3000);
            System.out.println("listSize = " + list.getSize());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
