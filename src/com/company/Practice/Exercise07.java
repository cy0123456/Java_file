package com.company.Practice;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数
 * 知识点： 基本字符之间可以直接比较
 * 因为包装的原因，存在自动包装
 * toCharArray() 字符串转数组
 *
 * */
public class Exercise07 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("请输入内容：");
        String sc = s.nextLine();
        char[] con = sc.toCharArray();
        int num = 0;
        int letter = 0;
        int space = 0;
        int other = 0;
        for (char u :con){
            if (u == ' '){
                space++;
            } else if(u >= '0' && u <= '9'){
                num++;
            } else if (u >= 'a' && u <= 'z' || u >= 'A' && u<= 'Z'){
                letter++;
            } else {
                other++;
            }
        }
        System.out.println("空格数为：" + space);
        System.out.println("数字数为：" + num);
        System.out.println("字母数为：" + letter);
        System.out.println("其他数为：" + other);
    }
}
