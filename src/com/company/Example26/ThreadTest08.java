package com.company.Example26;

public class ThreadTest08 {
    public static void main(String[] args) throws Exception{
        Thread t = new Thread(new User03());
        t.setName("t");
        t.start();
        Thread.sleep(5000);
        t.interrupt();
    }
}
class User03 implements Runnable{
    public void run(){
        try {
            Thread.sleep(100000000);
            System.out.println("Hello world");
        }catch (InterruptedException e){
//            e.printStackTrace();
        }
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}