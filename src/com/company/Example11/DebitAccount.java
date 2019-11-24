package com.company.Example11;

public class DebitAccount extends Account {
    private double debit;

    public DebitAccount() {
        //无参数构造方法
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }
}
