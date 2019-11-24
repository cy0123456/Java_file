package com.company.Example7;

public class CreditAccount extends Account{
    //此处的继承不能继承私有的东西， 只能继承公开的东西 ，例如里面的变量并没有继承
    //只是继承了里面的方法  间接可以访问私有变量
    private double credit;


    public CreditAccount() {
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
