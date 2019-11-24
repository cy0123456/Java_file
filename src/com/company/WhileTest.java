package com.company;

public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        int t = 0;
        A:for(;i <= 10 ; i++){
            B:for(int j = 1; j <= 10 ; j++){
                t++;
                System.out.print(t + "\t");
                if(i > 1){
                    break A;
                }
            }
        }
    }
}
