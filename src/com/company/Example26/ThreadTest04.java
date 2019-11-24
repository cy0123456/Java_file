package com.company.Example26;

public class ThreadTest04 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());

        Thread p = new Thread(new Processor01());
        p.start();
        Thread p1 = new Thread(new Processor01());
        p1.start();
        p.setName("p");
        p1.setName("p1");
    }
}
class Processor01 implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}
