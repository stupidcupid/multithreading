package com.multithreading.pc28;

/**
 * Created by nanzhou on 2017/6/12.
 */
public class Test1 {

    public static void main(String[] args) {

        try {
            String  lock = new String();
            System.out.println("syn 上面的代码");
            synchronized (lock){
                System.out.println("syn 第一行");
                lock.wait();
                System.out.println("wait 下的代码");
            }
            System.out.println("syn 下面的代码");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
