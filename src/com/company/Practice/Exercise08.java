package com.company.Practice;
import java.util.Scanner;
/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。输出结果的形式如：2+22+222=246；
 * */
public class Exercise08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入a的值：");
        int m1 = s.nextInt();
        System.out.print("请输入相加几次：");
        int m2 = s.nextInt();
        int u = 0;
        int u1 = 0;
        for (int i = 0;i< m2;i++){
            u = u + sumNum(m1,i);
            u1 = u1 + u;
            if (i < m2 -1){
                System.out.print(u + "+");
            }else {
                System.out.print(u + "=" + u1);
            }
        }
    }
    private static int sumNum(int m1,int m2){
        return (int)(m1*Math.pow(10,m2));
    }
}
