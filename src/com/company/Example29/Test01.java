package com.company.Example29;

import java.io.FileReader;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        FileReader fr = new FileReader("F:\\Java_file\\src\\com\\company\\Example29\\classInfo.properties");
        p.load(fr);
        fr.close();
        String className = p.getProperty("className");
        System.out.println(className);
        Class c = Class.forName(className);
        Object o = c.newInstance();
        System.out.println(o);
    }
}
