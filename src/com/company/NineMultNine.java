package com.company;

public class NineMultNine {
    public static void main(String[] args) {
        int t = 0;
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= i;j++){
                t = i *j;
                System.out.print(j + "*" + i + "=" + t + "\t");
            }
            System.out.print("\n");
        }
    }
}
