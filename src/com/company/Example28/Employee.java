package com.company.Example28;

public class Employee {
    private String name;

    public Employee() {
        System.out.println("无参数构造方法执行");
    }

    public Employee(String name) {
        this.name = name;
    }
    public void  work(){
        System.out.println(name + "在工作！");
    }

}
