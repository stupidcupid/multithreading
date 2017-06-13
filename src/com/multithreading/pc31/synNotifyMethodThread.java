package com.multithreading.pc31;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class synNotifyMethodThread extends Thread{

    private Object lock;

    public synNotifyMethodThread(Object lock){

        super();
        this.lock = lock;
    }

    @Override
    public void run(){

        Service service = new Service();
        service.synNotifyMethod(lock);
    }

}
