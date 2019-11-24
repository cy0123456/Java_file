package com.company.Example26;

public class ThreadTest10 {
    public static void main(String[] args) {
        Num account = new Num(1);
        Thread m1 = new Thread(new m1(account));
        Thread m2 = new Thread(new m2(account));
        m1.start();
        m2.start();
        m1.setName("m1");
        m2.setName("m2");
    }
}

class Num{
    int num;
    Num(int num){
        this.num = num;
    }
    synchronized void printOdd() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "---->" + num);
        num++;
        this.notifyAll();
        this.wait(10);
    }
    synchronized void printEven() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "---->" + num);
        num++;
        this.notifyAll();
        this.wait(10);
    }
}
/**
 * m1线程输出奇数，m2线程输出偶数
 * 目标输出0-100的所有自然数
 * m1 m2交替输出
 * */
class m1 implements Runnable{
    private Num account1;
    m1(Num account){
        this.account1 = account;
    }
    @Override
    public void run() {
        while(account1.num <= 100){
            try {
                account1.printOdd();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class m2 implements Runnable{
    private Num account2;
    m2(Num account){
        this.account2 = account;
    }
    @Override
    public void run() {
        while(account2.num <= 100){
            try {
                account2.printEven();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}