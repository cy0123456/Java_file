package com.company;
import java.util.Scanner;
public class RankSwitch {
    public static void main(String[] args){
        System.out.print("请输入您的成绩：");
        Scanner input = new Scanner(System.in);
        String a = input.next();
        switch (a.charAt(0)){
            case 'A':
                System.out.println("最高等级");
                break;
            case 'B':
                System.out.println("第二等级");
                break;
            case 'C':
                System.out.println("第三等级");
                break;
            default:
                System.out.println("您的成绩不合格");
        }
    }
}
