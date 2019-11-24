package com.company.Example7;

public class ExtendsTest {
    public static void main(String[] args) {
        CreditAccount act = new CreditAccount();
        act.setActno("act-001 你是个沙雕");
        act.setCredit(0.99);
        act.setBalance(-1000);

        System.out.println(act.getCredit());
        System.out.println(act.getActno());
        System.out.println(act.getBalance());
    }
}
