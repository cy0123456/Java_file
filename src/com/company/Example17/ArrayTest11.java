package com.company.Example17;

public class ArrayTest11 {
    public static void main(String[] args) {
        int[] a = {1,2, 3,4, 5,6,  7,9, 11,36, 89,101};
        System.out.println(search(1,a));
    }

    public static Object search(int u , int[] a){
        int floor = 0;
        int limit = a.length - 1;
        int k;
        for (int i = 0;i < a.length ;i++){
            k = (limit + floor)/2 ;
            if ((limit - floor) >= 3){
                if (u == a[k]){
                    return k;
                }else if (u < a[k]){
                    limit = k + 1;
                }else{
                    floor = k - 1;
                }
            }else{
                if (u == a[k]){
                    return k;
                }else if (u == a[k - 1]){
                    return (k - 1);
                }else if (u == a[k + 1]){
                    return (k + 1);
                }else{
                    return "您查找的数字不存在";
                }
            }

        }
        return "您查找的数字不存在";
    }
}
