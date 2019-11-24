package com.company;

import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        System.out.print("请输入你的成绩：");
        Scanner input = new Scanner(System.in);
        double grade = input.nextDouble();
        int frontGrade = (int)grade / 10;
        switch (frontGrade){
            case 10: case 9:
                System.out.println("您的成绩等级是A");
                break;
            case 8:
                System.out.println("您的成绩等级是B");
                break;
            case 7:
                System.out.println("您的成绩等级是C");
                break;
            case 6:
                System.out.println("您的成绩等级是D");
                break;
            default:
                System.out.println("您的成绩等级是E");
        }
    }
}
