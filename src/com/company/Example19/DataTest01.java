package com.company.Example19;


import java.text.SimpleDateFormat;
import java.util.Date;


public class DataTest01 {
    public static void main(String[] args) {
        Date nowTime = new Date();
        System.out.println(nowTime);
        SimpleDateFormat sj = new SimpleDateFormat("yyyy年MM月dd日  HH：mm：ss SSS");
        String strTime = sj.format(nowTime);
        System.out.println(strTime);
    }
}
