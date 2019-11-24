package com.company.Practice;
import java.util.Scanner;
/**
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。*/
public class Exercise04 {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.print("请输入您想分解的正整数：");
        int u = p.nextInt();
        System.out.print(u + "=");
//        for (int i = 2;i < u ;i++){
//            if (u%i == 0){
//                System.out.print(i + "*");
//                u = u/i;
//                i = 1;
//            }
//        }
//        System.out.print(u);
        for (int i = 2; i<=u ;i++){
            while(u%i == 0 && u != i){
                u = u/i;
                System.out.print(i + "*");
            }
            if (u == i){
                System.out.print(u);
            }
        }
    }
}
