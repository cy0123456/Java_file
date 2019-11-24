package com.company.Practice;
import java.util.Scanner;
/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
**/
public class Exercise06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入第一个数字：");
        int num1 = s.nextInt();
        System.out.print("请输入第二个数字：");
        int num2 = s.nextInt();
        int u1 = maxNum(num1,num2);
        int u2 = minNum(num1,num2);
        System.out.println(u1);
        System.out.println(u2);
    }
    /**
     * 最大公约数*/
    private static int maxNum(int m1,int m2){
        int num = 1;
        if (m1 >= m2){
            for (int i = 2;i <= Math.sqrt(m1);i++){
                while (m1%i == 0 && m2%i ==0){
                    m1 = m1/i;
                    m2 = m2/i;
                    num = num * i;
                }
            }
        }else {
            for (int i = 2;i <= Math.sqrt(m2);i++){
                while (m1%i == 0 && m2%i ==0){
                    m1 = m1/i;
                    m2 = m2/i;
                    num = num * i;
                }
            }
        }
        return num;
    }
    private static int minNum(int m1,int m2){
        int u = maxNum(m1,m2);
        return m1/u * m2/u *u;
    }
}
