package com.company;

import java.util.Scanner;

public class WeatherJudge {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("当前天气为：");
        String weather = input1.next();
        System.out.print("此人性别为：");
        String gender = input1.next();
        if(weather.equals("下雨")){
            if (gender.equals("男性") ){
                System.out.println("带一把大雨伞");
            }else {
                System.out.println("带一把小雨伞");
            }
        }else if (weather.equals("晴天")){
            System.out.print("此时温度为：");
            double temper = input1.nextDouble();
            if (temper > 30.0){
                if (gender.equals("男性")) {
                    System.out.println("戴墨镜");
                }else{
                    System.out.println("擦防晒霜");
                }
            }else {
                System.out.println("今天是个好天气，适合出门散心");
            }
        }else{
            System.out.println("对不起，您输入的天气状况不存在");
        }
    }
}
