package com.company.Example27;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest01 {
    public static void main(String[] args) throws Exception{
        Timer t = new Timer();
        t.schedule(new LogTimeTask(),
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2019-11-01 10:22:50 000"),
                10*1000);
    }
}

class LogTimeTask extends TimerTask{
    @Override
    public void run() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
}