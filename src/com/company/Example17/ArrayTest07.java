package com.company.Example17;

public class ArrayTest07 {
    public static void main(String[] args) {
        m1(new int[][]{{1,2,3,4,6},{1,2,3,56,7},{1,12,321,5656}});
    }

    public static void m1(int[][] a) {
        for(int i=0;i< a.length;i++){
            for (int j = 0 ; j< a[i].length;j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
