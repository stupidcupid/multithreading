package com.multithreading.pc19;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class DealThread extends  Thread{

    public String userName;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String userName){

        this.userName = userName;
    }

    @Override
    public void run(){

        if("a".equals(userName)){

            synchronized (lock1){

                System.out.println("userName= " + userName );
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("lock1 -> lock2 ");
                }
            }
        }
        if("b".equals(userName)){

            synchronized (lock2){

                System.out.println("userName= " + userName );
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("lock2 -> lock1 ");
                }
            }
        }
    }
}
