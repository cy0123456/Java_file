package com.company.Example17;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] a1 = {100,200,300};  //静态初始化
        a1[1] = 600;
        System.out.println(a1[0] + a1[1]);
        System.out.println(a1[a1.length - 1]);

        int[] a2 = new int[4];
        for (int i = 0; i < a2.length ; i++){
            a2[i] = i;
            System.out.println(a2[i]);
        }

        Object[] obj = new Object[4];
        for (int i = 0 ; i < obj.length ; i++){
            Object o = obj[i];
            System.out.println(o);

//          o.toString();
        }
    }
}
