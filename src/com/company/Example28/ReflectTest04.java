package com.company.Example28;

import java.io.FileInputStream;
import java.util.Properties;

public class ReflectTest04 {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();

        FileInputStream fis = new FileInputStream("F:\\Java_file\\src\\com\\company\\Example28\\dbinfo.properties");
        p.load(fis);

        fis.close();
        String v = p.getProperty("username");
        System.out.println(v);
    }
}