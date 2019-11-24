package com.company;

public class FindPrimeNum {
    public static void main(String[] args) {
        int t = 0;
        int u = 2;
        System.out.println(1);
        System.out.println(2);
        for (int i = 2 ; i <= 100 ; i++){
            u = 2;
            for (int j = 2 ; j < i ; j++){
                t = i%j;
                if (t == 0){
                    break;
                }
                u++;
                if(u == i){
                    System.out.println(i);
                }
            }

        }
    }
}
