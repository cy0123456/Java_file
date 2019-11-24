package com.company.Example10;

public class FinalTest {

    final int age;
    public FinalTest(){
        this.age = 20;
    }
    /**
     * 如果不赋值， 它默认为10  然后再赋值的话，就会导致变量发生变化，故会出错
     */

    public static void main(String[] args) {
        final int i;
        i = 20;

    }
}
