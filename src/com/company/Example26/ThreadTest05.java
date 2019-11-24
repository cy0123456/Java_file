package com.company.Example26;

public class ThreadTest05 {
    public static void main(String[] args) {

        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        Thread t1 = new User();
        t1.setName("t1");

        Thread t2 = new User();
        t2.setName("t2");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(4);
        t2.setPriority(6);

        t1.start();
        t2.start();
    }
}
class User extends Thread{
    public void run(){
        for (int i = 0;i<50;i++){
            System.out.println(Thread.currentThread().getName() + "----->" + i);
        }
    }
}
