package com.multithreading.pc8;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class MethodA extends  Thread {

    private Sub sub;

    public MethodA(Sub sub){

        super();
        this.sub = sub;

    }

    @Override
    public void run(){

        sub.serviceMethod();
    }




}
