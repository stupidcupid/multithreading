package com.multithreading.pc36;

/**
 * Created by nanzhou on 2017/6/16.
 */
public class Run {

    public static void main(String[] args) throws  InterruptedException{


        String lock = new String("");
        Add add = new Add(lock);

        Subtract subtract = new Subtract(lock);

        ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
        threadSubtract1.setName("threadSubtract1");
        threadSubtract1.start();


        ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
        threadSubtract2.setName("threadSubtract2");
        threadSubtract2.start();

        Thread.sleep(1000);

        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("threadAdd");
        threadAdd.start();
    }
}
