package com.company.Example17;

public class ArrayTest06 {
    public static void main(String[] args) {
        int[][] u = {{1,2},{2,3,5,10},{4,6,6,3,9,9,8,4}};
//        System.out.println(u.length);
        for (int i = 0;i < u.length;i++){
            for (int j = 0; j < u[i].length; j++){
                System.out.print(u[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
