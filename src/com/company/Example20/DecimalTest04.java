package com.company.Example20;

//除法，成功返回1，失败返回0
public class DecimalTest04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 0;
        Result reValue1 = m1(a,b);
        Result reValue2 = m1(a,c);
        if (reValue2 == Result.SUCCESS){
            System.out.println("成功");
        }else if (reValue2 == Result.FAIL){
            System.out.println("失败");
        }
    }
    public static Result m1(int a,int b){
        try {
            int c = a/b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}
enum Result{
    SUCCESS,FAIL
}