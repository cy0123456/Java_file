package com.company.Example17;
//数组拷贝
public class ArrayTest04 {
    public static void main(String[] args) {
        String[] n = {"zhangsan","lisi","wangmazi","jiangqing"};
        k(n);
        String[] n1 = {"1","2","3","4"};
        System.arraycopy(n,0,n1,3,1);
        System.out.print('\n');
        for (int i = 0; i< n1.length;i++){
            System.out.print(n1[i] +'\t');
        }
        int[] u1 = {1,2,3,4,5,6,7,8,9};
        int[] u2 = {10,11,12,13,14,15,16,17,18,19,20};
        System.arraycopy(u1,3,u2,u2.length-3,3);
        System.out.print('\n');
        for (int i = 0; i< u2.length;i++){
            System.out.println(u2[i]);
        }
    }
    public static void k(String[] u){
        String[] u1 = new String[u.length];
        for (int i = 0; i< u.length;i++){
            u1[i] = u[i];
        }
        for (int i = 0; i< u.length;i++){
            System.out.print(u1[i] +'\t');
        }
    }
}
