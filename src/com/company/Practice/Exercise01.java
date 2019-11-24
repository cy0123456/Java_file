package com.company.Practice;
import java.util.Scanner;


/**古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 * */
public class Exercise01 {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.print("请输入您想知道哪个月的兔子数量：");
        int t = p.nextInt();
        System.out.println("第" + t  + "月的兔子对数为："  + m2(t));
    }
//    public static void m1(int month){
//        int[] num = new int[month];
//        num[0] = 1;
//        num[1] = 1;
//        for (int i = 2;i<month;i++){
//            num[i] = num[i-1] + num[i-2];
//        }
//        System.out.println("第" + month + "月有" + num[month - 1] + "对兔子");
//    }
    public static int m2(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return m2(n-1) + m2(n-2);
        }
    }
}
