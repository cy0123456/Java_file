package com.company.Example23;
import java.util.*;
public class MapTest02 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("username","scoot");
        p.setProperty("password","tiger");
        String v1 = p.getProperty("username");
        String v2 = p.getProperty("password");
        System.out.println(v1);
        System.out.println(v2);
    }
}
