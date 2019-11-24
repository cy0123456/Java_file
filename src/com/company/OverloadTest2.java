package com.company;

public class OverloadTest2 {
    public static void main(String[] args) {
        int b = recursion(11);
        System.out.println(b);
    }
    public static int recursion(int n){
        if(n == 1){
            return 1;
        }
        return n*(recursion(n-1));
    }
}
