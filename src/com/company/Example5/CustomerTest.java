package com.company.Example5;

public class CustomerTest {
    int i = 1000;   //此为实例变量 static中无法直接调用实例变量
    public static void main(String[] args) {
        CustomerTest c = new CustomerTest();
//        System.out.println(c.i);
        c.can();
        can1(10);
        c.can1(10);
        c.can2();
    }
    //这个是实例方法 必须先创造对象，然后调用 采用引用.方法
    public void can(){
        System.out.println("can:" + i);
    }

    //这是个静态方法 访问时采用类名.方法   而实例方法中（无static） 访问时采用引用.方法
    public static void can1(int n){
//        for(int i = 0 ; i < n ; i ++){
//            System.out.println(i);
//        }
        System.out.println("can1");
    }

    public void can2(){
        can();
        System.out.println("can2");
    }


}
