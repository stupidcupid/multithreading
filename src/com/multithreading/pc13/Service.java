package com.multithreading.pc13;

/**
 * Created by nanzhou on 2017/6/2.
 */
public class Service {

    private String usernameParam;

    private String passwordParam;

    //private String anyThing  = new String();

    public void setUsernamePassword(String username,String password){

        try {
            String anyThing = new String();
            synchronized (anyThing){
                System.out.println("线程名:"+ Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + "进入同步块");
                usernameParam= username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("线程名:"+ Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + "离开同步快");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
