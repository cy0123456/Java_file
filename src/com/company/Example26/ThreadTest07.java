package com.company.Example26;

public class ThreadTest07 {
    public static void main(String[] args) throws Exception{
        Thread t = new User02();
        t.setName("t");
        t.start();
        Thread.sleep(5000);
        System.out.println("hello world");
    }
}
class User02 extends Thread{
    public void run(){
        for (int i = 0;i<200;i++){
            System.out.println(Thread.currentThread().getName() + "------>" + i);
        }
    }
}
