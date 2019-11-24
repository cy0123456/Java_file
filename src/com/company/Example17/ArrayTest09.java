package com.company.Example17;
/**
 * 冒泡排序法，将3，1，6，2，5进行从小到大排序*/
public class ArrayTest09 {
    public static void main(String[] args) {
        int[] num = {3,1,6,2,5,62,23,12,56,98,10,1,3,5,6};
        sort(num);
    }


    public static void sort(int[] u){
        for (int i = 1; i< u.length;i++){
            for (int j = 0; j < u.length-i ; j++){
                if (u[j] > u[j+1]){
                    int m = u[j+1];
                    u[j+1] = u[j];
                    u[j] = m;
                }
            }
        }
        for (int i = 0; i< u.length;i++){
            System.out.println(u[i]);
            }
    }

}
