package com.company;

public class FindPrimeNumPro {
    public static void main(String[] args) {
        int t = 0;
        int u = 2;
        int n = 0;
        for (int i = 2 ; i <= 10000 ; i++){
            u = 1;
            for (int j = 2 ; j <= i ; j++){
                t = i%j;
                if (t == 0 && i!=j){
                    break;
                }
                u++;
                if(u == i){
                    System.out.print(i + "\t");
                    n++;
                }
            }
            if (n == 8){
                n = 0;
                System.out.print("\n");
            }
        }
    }
}
