package com.company.Example26;

public class ThreadTest09 {
    public static void main(String[] args) throws Exception {
        User04 user = new User04();
        Thread t = new Thread(user);
        t.setName("t");
        t.start();
        Thread.sleep(5000);
        user.ron = false;
    }
}
class User04 implements Runnable{
    Boolean ron = true;
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            if (ron){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "---->" + i);
            }else {
                return;
            }

        }
    }
}
