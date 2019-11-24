package com.company.Example11;

public class Manager extends Exployee {
    String name = "李四";
    public void work(){
        System.out.println("经理在工作");
    }

    public void m1(){
        super.work();
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
