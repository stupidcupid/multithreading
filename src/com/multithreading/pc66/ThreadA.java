package com.multithreading.pc66;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class ThreadA extends Thread {

    private Service service;


    public  ThreadA(Service service) {

        super();
        this.service = service;
    }

    @Override
    public void run(){

        service.read();
    }
}
