package com.company.Practice;
/**
 * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。*/
public class Exercise03 {
    public static void main(String[] args){
        printFlower();
    }
    private static void printFlower(){
        for (int i = 100;i<=999 ;i++){
            int u1 = i/100;
            int u2 = (i/10)%10;
            int u3 = i%10;
//            if ((Math.pow(u1,3) + Math.pow(u2,3) + Math.pow(u3,3)) == i ){
//                System.out.println(i);
//            }
            if ((u1*u1*u1 + u2*u2*u2 + u3*u3*u3) == i){
                System.out.println(i);
            }
        }
    }
}
