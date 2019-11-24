package com.company.Example26;

public class ThreadTest06 {
    public static void main(String[] args) throws Exception{
        Thread t1 = new User1();
        t1.setName("t1");
        t1.start();

        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "------>" + i);
            Thread.sleep(500);
        }
    }
}
class User1 extends Thread{
    /*
    * 重写的方法不能抛出异常，故不能使用throws
    * */
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
