package com.multithreading.pc8;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class MethodB extends  Thread{

    private Sub sub;

    public MethodB(Sub sub){

        super();
        this.sub = sub;

    }

    @Override
    public void run(){

        sub.serviceMethod();
    }

}
