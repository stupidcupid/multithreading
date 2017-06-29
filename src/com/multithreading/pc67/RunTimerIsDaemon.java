package com.multithreading.pc67;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by nanzhou on 2017/6/29.
 */
public class RunTimerIsDaemon {

    private static Timer timer = new Timer(true);

    static public class MyTask extends TimerTask {

        @Override
        public void run() {

            System.out.println("Run time is " + new Date());
        }
    }

    public static void main(String[] args) {

        try {
            MyTask myTask = new MyTask();

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String dateString = "2017-06-29 14:44:00";
            Date dateRef = format.parse(dateString);
            System.out.println("字符串时间" + dateRef.toLocaleString() + "当前时间 " + new Date().toLocaleString());
            timer.schedule(myTask, dateRef);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
