package com.company;

public class OddJudge {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1 ; i <= 100 ; i+=2){
            sum += i;
        }
        System.out.println(sum);
    }
}
