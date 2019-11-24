package com.company.Example4;

public class User {
    private String name;
    private int age;
    public User(){
        System.out.println("User's Default Constructor Invoke");
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**这是一个构造方法，采用引用名.方法
     * 不同于static方法，类名.方法
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void age1(){
        if (age < 50){
            System.out.println("年龄尚小");
        }else{
            System.out.println("年迈");
        }
    }
}
