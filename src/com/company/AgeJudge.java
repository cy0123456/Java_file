package com.company;

import java.util.Scanner;

public class AgeJudge {
    public static void main(String[] args){
        //创建键盘扫面器对象
        Scanner s = new Scanner(System.in);
        //调用Scanner对象的next()方法开始接受输入   首先导入包  import java.util.Scanner    Scanner s = new Scanner(System.in)   int age = s.nextInt()
        System.out.print("此人年龄为：");
        int age = s.nextInt();
        if (age < 0 || age > 150){
            System.out.println("输入出错");
        }else if (age < 5){
            System.out.println("幼儿");
        }else if (age < 10){
            System.out.println("少儿");
        }else if (age < 18){
            System.out.println("青少年");
        }else if (age < 35){
            System.out.println("青年");
        }else if (age < 55){
            System.out.println("中年");
        }else if (age < 150){
            System.out.println("老年");
        }
    }
}
