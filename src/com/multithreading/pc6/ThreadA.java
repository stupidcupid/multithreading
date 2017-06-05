package com.multithreading.pc6;

/**
 * Created by nanzhou on 2017/5/31.
 */
public class ThreadA extends  Thread{


    private PublicVar publicVar;

    public ThreadA(PublicVar publicVar){

        super();
        this.publicVar  = publicVar;

    }

    @Override
    public void run(){

        super.run();
        publicVar.setValue("B","BB");
    }

}
