package com.company.Example17;
//二分法

public class ArrayTest12 {
    public static void main(String[] args) {
        int[] a = {1,2, 3,4, 5,6,  7,9, 11,36, 89,101};
        System.out.println(search(1,a));
    }

    public static int search(int u , int[] a){
        int floor = 0;
        int limit = a.length - 1;
        int k;
        while(floor <= limit){
            k = (limit + floor)/2;
            if (u == a[k]){
                return k;
            }else if (u < a[k]){
                limit = k - 1;
            }else{
                floor = k + 1;
            }
        }
        return -1;
    }
}
