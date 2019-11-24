package com.company.Example25;

import javafx.scene.input.DataFormat;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("src\\com\\company\\Example25\\FileTest02.java");
        File f2 = new File("F:\\Java_file\\src\\com\\company\\Example25\\FileTest02.java");
        String obp = f1.getAbsolutePath();
        System.out.println(obp);
        System.out.println(f1.getName());
        System.out.println(f2.getParent());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());

        Date t = new Date(f1.lastModified());
        SimpleDateFormat spy = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(spy.format(t));

        File f3 = new File("F:\\Java_file\\src\\com\\company");
        File[] fs = f3.listFiles();
        for (File u : fs){
            if (u.getAbsolutePath().endsWith(".java")){
                System.out.println(u);
            }
        }
    }
}