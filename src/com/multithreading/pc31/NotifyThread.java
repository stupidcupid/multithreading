package com.multithreading.pc31;

/**
 * Created by nanzhou on 2017/6/13.
 */
public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {

        super();
        this.lock = lock;
    }

    @Override
    public void run() {

        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
