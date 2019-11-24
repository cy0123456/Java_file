package com.company.Example25;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        File f = new File("E:\\安装包");
        method1(f);
    }
    public static void method1(File f){
        if(f.isFile()){
            return;
        }
        File[] fls = f.listFiles();
        for (File u : fls){
            System.out.println(u.getAbsolutePath());
            method1(u);
            /**
             * 递归，先找出所有的子，然后子调用方法，若满足是文件的条件，则跳出，直到遍历所有的子*/
        }
    }
}
