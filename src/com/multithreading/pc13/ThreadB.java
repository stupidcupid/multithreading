package com.multithreading.pc13;

/**
 * Created by nanzhou on 2017/6/2.
 */
public class ThreadB  extends  Thread{

    private Service service;

    public ThreadB(Service service){
        super();
        this.service = service;

    }

    @Override
    public void run(){

        super.run();
        service.setUsernamePassword("b","bb");
    }
}
