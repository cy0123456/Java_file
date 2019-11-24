package com.company;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        System.out.println("欢迎使用简单的计算器系统");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个数字:");
        int number1 = input.nextInt();
        System.out.print("请输入运算符:");
        String operator = input.next();
        System.out.print("请输入第二个数字:");
        int number2 = input.nextInt();
        int number3 = 0;
        switch (operator){
            case "+":
                number3 = number1 + number2;
                break;
            case "-":
                number3 = number1 - number2;
                break;
            case "*":
                number3 = number1 * number2;
                break;
            case "/":
                number3 = number1 / number2;
                break;
            case "%":
                number3 = number1 % number2;
                break;
            default:
                System.out.println("您输入的算符号不存在");
        }
        System.out.println("运算结果为：" + number1 +  operator + number2 + "=" + number3);
    }
}
