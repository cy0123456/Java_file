package com.company.Example25;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintStreamTest01 {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello,World");
        PrintStream ps = System.out;
        ps.println("Java....");
        System.setOut(new PrintStream(new FileOutputStream("src\\com\\company\\Example25\\temp06.txt")));
//        System.out.println("HAHA");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("m1方法执行开始" + sdf.format(new Date()));
        m1();
        System.out.println("m1方法执行结束" + sdf.format(new Date()));
    }

    public static void m1(){
        System.out.println("m1 method execute!");
    }
}
