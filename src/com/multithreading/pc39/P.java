package com.multithreading.pc39;

/**
 * Created by nanzhou on 2017/6/19.
 */
public class P {

    private MyStack myStack;

    public P(MyStack myStack){

        super();
        this.myStack = myStack;
    }

    public void pushService(){

        myStack.push();
    }
}
