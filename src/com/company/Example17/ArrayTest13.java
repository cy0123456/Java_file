package com.company.Example17;

import java.util.Arrays;

public class ArrayTest13 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,22,36,98,63,12,45,30,21};
        Arrays.sort(a);
        for (int value : a) {
            System.out.println(value);
        }
        int b = Arrays.binarySearch(a,3);
        System.out.println(b);
    }
}
