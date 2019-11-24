package com.company.Example17;
/**
 * 选择排序法： 依次比较 比较出最大的 放在最后*/
public class ArrayTest10 {
    public static void main(String[] args) {
        int[] num = {3,1,6,2};
        int[] num1 = sort(num);
        for (int value : num1) {
            System.out.println(value);
        }
    }
    public static int[] sort(int[] u){
        int k ;
        int n ;
        for (int i = 0 ;i<u.length-1; i++){
            n = i;
            k = u[i];
            for (int j = i+1;j< u.length;j++){
                if (k > u[j]){
                    k = u[j];
                    n = j;
                }
            }
            u[n] = u[i];
            u[i] = k;
        }
        return u;
    }
}
