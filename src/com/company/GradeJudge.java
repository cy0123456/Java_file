package com.company;

import java.util.Scanner;

public class GradeJudge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入该学生成绩：");
        double grade = input.nextDouble();
        if(grade > 100 || grade < 0){
            System.out.println("该学生成绩不合法");
        } else if(grade >= 90.0){
            System.out.println("该学生成绩等级为：A");
        } else if(grade >= 80.0){
            System.out.println("该学生成绩等级为：B");
        } else if(grade >= 70.0){
            System.out.println("该学生成绩等级为：C");
        } else if(grade >= 60.0){
            System.out.println("该学生成绩等级为：D");
        } else{
            System.out.println("该学生成绩等级为：E");
        }
    }
}
