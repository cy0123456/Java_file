package com.company;

public class OOTest04 {
    public static void main(String[] args) {

        //创建丈夫
        Husband hxm = new Husband();
        hxm.name = "hxm";
        //创建妻子
        Wife baby = new Wife();
        baby.name = "baby";
        //结婚【能相互找到】
        baby.h = hxm;
        hxm.w = baby;
        System.out.println("黄晓明的妻子名字是" + hxm.w.name);
        System.out.println("baby的丈夫的名字是" + baby.h.name);


    }
}
