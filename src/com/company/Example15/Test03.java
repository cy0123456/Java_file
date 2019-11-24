package com.company.Example15;

public class Test03 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        p = null;
        //建议回收
        p = new Person1();
        p.name = "zhangsan";
        System.out.println(p.name);
        System.gc();
    }
}
class Person1{
    String name;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾马上要被回收了");
    }
}
