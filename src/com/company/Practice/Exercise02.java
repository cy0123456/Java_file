package com.company.Practice;
/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数。*/
public class Exercise02 {
    public static void main(String[] args) {
        for (int i = 101;i<200;i++){
            if (m2(i)){
                System.out.println(i);
            }
        }
    }
//    public static void m1(int a,int b){
//        for (;a<=b;a++){
//            int u = 0;
//            for (int i = 1;i<=a ;i++){
//                if (a%i == 0 && i!=1 && i!=a){
//                    break;
//                }
//                u++;
//            }
//            if (u == a){
//                System.out.println(a);
//            }
//        }
//    }
    public static boolean m2(int a){
        for (int i = 2;i<Math.sqrt(a);i++){
            if (a%i == 0){
                return false;
            }
        }
        return true;
    }
}
