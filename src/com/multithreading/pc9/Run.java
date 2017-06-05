package com.multithreading.pc9;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class Run {

    public static void main(String[] args) {

        Task task  = new Task();
        MyThread1 mythread1 = new MyThread1(task);
        mythread1.start();

        MyThread2 myThread2 = new MyThread2(task);
        myThread2.start();

        try {
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;

        if(CommonUtils.beginTime2 < CommonUtils.beginTime1){

            beginTime = CommonUtils.beginTime2;

        }
        long endTime = CommonUtils.endTime1;

        if(CommonUtils.endTime2 >  CommonUtils.endTime1){
            endTime = CommonUtils.endTime2;
        }
        System.out.println(endTime);
        System.out.println(beginTime);
        System.out.println("耗时" + ((endTime - beginTime)/1000) );


    }
}
