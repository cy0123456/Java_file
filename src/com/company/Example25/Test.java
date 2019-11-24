package com.company.Example25;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File fls = new File("E:\\安装包");
        File[] files = fls.listFiles();
        for (File u :files){
            String name = u.getName();
            String path = "E:\\安装包"  + "\\"+ name;
            System.out.println(path);
        }
    }
}
