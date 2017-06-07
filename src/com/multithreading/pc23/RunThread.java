package com.multithreading.pc23;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class RunThread extends Thread {

    private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        this.isRunning=isRunning;
    }

    @Override
    public void run(){

        System.out.println("进入 run 了");
        while(isRunning == true){

        }
        System.out.println("线程已停止");
    }
}
