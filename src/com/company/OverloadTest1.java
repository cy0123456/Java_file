package com.company;

public class OverloadTest1 {
    public static void main(String[] args) {
        int a = sum1(10);
        System.out.println(a);
    }
    public static int sum(int n){
        int sum1 = 0;
        for(int i = 0; i <= n;i++){
            sum1 = sum1 + i;
        }
        return sum1;
    }
    public static int sum1(int n){
        if(n == 1){
            return 1;
        }
        return n + sum1(n - 1);
    }
}
