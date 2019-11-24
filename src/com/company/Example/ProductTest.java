package com.company.Example;

public class ProductTest{
    public static void main(String[] args){
        Product iphone7 = new Product();
        //此为局部变量，保存地址 地址指向堆内存；
        iphone7.price = 68000;
        iphone7.productNo = 1530;
        System.out.println("商品编号:" + iphone7.productNo);
        System.out.println("商品价格：" + iphone7.price);

    }
}
