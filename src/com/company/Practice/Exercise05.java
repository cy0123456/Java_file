package com.company.Practice;
import java.util.Scanner;
/**
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 知识点： (条件)？ A：B  条件对执行A 错误执行B
 * */
public class Exercise05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int u = s.nextInt();
        String grade = (u >= 90)? "A" : (u>= 60? "B" : "C");
        System.out.print("改成绩等级为：" + grade);
    }
}
