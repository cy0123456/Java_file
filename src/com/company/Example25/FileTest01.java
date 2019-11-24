package com.company.Example25;

import java.io.File;

public class FileTest01 {
    public static void main(String[] args) throws Exception {
        File f1 = new File("src\\com\\company\\Example25\\FileTest01.java");
        File f2 = new File("F:\\Java_file\\src\\com\\company\\Example25\\FileTest01.java");
        File f3 = new File("F:/Java_file");
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f3.exists());

        File f4 = new File("F:\\Java_file\\src\\com\\company\\Example26");
        System.out.println(f4.getName());
    }
}
