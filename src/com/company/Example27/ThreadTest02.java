package com.company.Example27;

public class ThreadTest02 {
    public static void main(String[] args) throws Exception{
        Myclass mc = new Myclass();
        Processor1 p = new Processor1(mc);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        Thread.sleep(500);
        t2.start();
    }
}
class Processor1 implements Runnable{
    Myclass mc;
    Processor1(Myclass mc){
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            mc.m1();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.m2();
        }
    }
}


class Myclass{
    public synchronized void m1(){
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("m1.....");
    }
/**
 *  public void m2(){
        System.out.println("m2.....");
    }
    这个方法不会等，因为无synchronized
 */
    public synchronized void m2(){
        System.out.println("m2.....");
    }
/**这个方法会等，因为有synchronized，他的上锁对象也为this（mc）
 * 当m1运行时，便占据了this的锁，m2只能等待
 * */
}