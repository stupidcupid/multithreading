package com.multithreading.pc39;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanzhou on 2017/6/19.
 */
public class MyStack {

    private List list = new ArrayList();

    synchronized public void push() {


        try {
            if (list.size() == 1) {
                this.wait();
            }
            list.add("anyString = " + Math.random());
            this.notify();
            System.out.println("push " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {

        String returnValue = "";

        try {
            if (list.size() == 0) {
                System.out.println("pop 操作中的" + Thread.currentThread().getName() + " 线程呈 wait 状态");
                this.wait();
            }
            returnValue = "" + list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}

