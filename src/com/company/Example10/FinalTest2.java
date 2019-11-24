package com.company.Example10;

public class FinalTest2 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);
        System.out.println(Math.PI);
    }
}

class Chinese{
    //需求，要求国籍不可改变，并且每个人都是中国国籍；
    public static final String COUNTRY = "中国";
}
class Math{
    public static final double PI = 3.1415926;
}