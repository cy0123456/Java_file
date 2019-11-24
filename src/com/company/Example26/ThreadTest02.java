package com.company.Example26;

public class ThreadTest02 {
    public static void main(String[] args) {
        Thread t = new Processor();
        t.start();
        for (int i = 0;i<50;i++){
            System.out.println("main---->" + i);
        }
    }
}
class Processor extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println("run---->" + i);
        }
    }
}
