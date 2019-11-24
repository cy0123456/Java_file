package com.company.Example20;

import java.util.Random;
//产生不等的随机数并且不为0
public class DecimalTest05 {
    public static void main(String[] args) {
        Random Num = new Random();
        int[] k = new int[5];
        int index = 0;
        while (index < 5) {
            int num = Num.nextInt(6);
            if (num != 0 && compare(k, num)) {
                k[index] = num;
                index++;
            }
        }
        for (int c : k){
            System.out.println(c);
        }
    }

    public static boolean compare(int[] a, int b) {
        for (int c : a) {
            if (c == b) {
                return false;
            }
        }
        return true;
    }
}
