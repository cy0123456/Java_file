package com.company.Example26;

public class ThreadTest03 {
    public static void main(String[] args) {
        Thread t = new Thread(new Processor1());
        t.start();
    }
}
class Processor1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println("run--->" + i);
        }
    }
}
