package com.company.Example28;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReflectTest02 {
    public static void main(String[] args) throws Exception {
        Class c1 =  Class.forName("java.util.Date");
        Object o = c1.newInstance();
        if (o instanceof Date){
            Date t = (Date)o;
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH-mm-sss SSS").format(t));
        }

    }
}
