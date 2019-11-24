package com.company.Example24;



public class ThreadTest03 {
    public static void main(String[] args) throws Exception{
        Account act = new Account("actno-001",5000.00);
        Processor pr = new Processor(act);
        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(pr);
        t1.start();
        t2.start();
    }
}
class Processor implements Runnable{
    Account act;
    Processor(Account act){
        this.act = act;
    }
    @Override
    public void run() {
        act.withdraw(1000.0);
        System.out.println("取款1000.0成功，余额为：" + act.getBalance());
    }
}


class Account{
    private String actno;
    private double balance;

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public Account() {
    }

    public synchronized void withdraw(double money){
        double after = balance - money;
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.setBalance(after);
    }
}
