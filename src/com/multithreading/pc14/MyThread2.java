package com.multithreading.pc14;

/**
 * Created by nanzhou on 2017/6/2.
 */
public class MyThread2 extends  Thread {

    private MyOneList myOneList;

    public MyThread2(MyOneList myOneList){

        super();
        this.myOneList = myOneList;

    }

    @Override
    public void run(){

        MyService myService = new MyService();
        myService.addServiceMethod(myOneList,"B");

    }

}
