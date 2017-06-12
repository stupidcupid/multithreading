package com.multithreading.pc27;

import java.util.List;

/**
 * Created by nanzhou on 2017/6/7.
 */
public class ThreadA extends  Thread {

    private MyList list;

    public ThreadA(MyList list){

        super();
        this.list = list;
    }

    @Override
    public void run(){

        for(int i = 0; i< 10; i++ ){

            System.out.println("添加了 " + (i+1) + "个元素");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
