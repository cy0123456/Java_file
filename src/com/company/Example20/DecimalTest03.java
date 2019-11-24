package com.company.Example20;

import java.util.Random;

public class DecimalTest03 {
    public static void main(String[] args) {
        Random r = new Random();
        int k ;
        int[] num = new int[5];
        for (int i = 0;i<5;i++){
            k = r.nextInt(6);
            for (int j = 0;j < i;j++){
                while (k == num[j] || k == 0){
                    k = r.nextInt(6);
                    j = 0;
                }
            }
            num[i] = k;
            System.out.println(num[i]);
        }
    }
}
