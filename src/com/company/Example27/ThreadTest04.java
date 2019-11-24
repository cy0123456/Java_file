package com.company.Example27;

public class ThreadTest04 {
    public static void main(String[] args) throws Exception {
        Num n = new Num(1);
        Thread m1 = new Thread(new m1(n));
        Thread m2 = new Thread(new m2(n));
        m1.setName("m1");
        m2.setName("m2");
        m1.start();
        m2.start();
    }
}

class Num{
    int num;
    Num(int num){
        this.num = num;
    }

    public synchronized void printOdd() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "---->" + num++);
        this.notifyAll();
        this.wait(10);
    }

    public synchronized void printEven() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "---->" + num++);
        this.notifyAll();
        this.wait(10);
    }
}
/*
* 线程m1输出奇数
* */
class m1 implements Runnable{
    Num n;
    m1(Num n){
        this.n = n;
    }
    @Override
    public void run() {
        while(true){
            try {
                n.printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class m2 implements Runnable{
    Num n;
    m2(Num n){
        this.n = n;
    }
    @Override
    public void run() {
        while(true){
            try {
                n.printEven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}