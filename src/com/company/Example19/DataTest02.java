package com.company.Example19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest02 {
    public static void main(String[] args) throws ParseException {
        String strTime ="2008年08月08日 08：08：08 888";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss SSS");
        Date t =  sdf.parse(strTime);
        System.out.println(t);
        Date u = new Date(1000);
        System.out.println(sdf.format(u));
    }

}
