package com.multithreading.pc39;

/**
 * Created by nanzhou on 2017/6/19.
 */
public class C {

    private MyStack myStack;

    public C(MyStack myStack){

        super();
        this.myStack = myStack;
    }

    public void popService(){

        System.out.println("pop = " + myStack.pop());
    }
}
