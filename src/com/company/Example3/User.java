package com.company.Example3;

public class User {
    private int age;

    public void setAge(int a){
        //age = age 这么写没有意义 就近原则
        if(a < 0 || a > 150){
            System.out.println("年龄不合法");
        }else {
            age = a;
        }
    }
    public int getAge(){
        return age;
    }
}
