package com.company.Example18;

import java.util.Arrays;

public class StringTest
{
    public static void main(String[] args) {

        String myTime = "2018,08,18";
        String[] myTime1 = myTime.split(",");
        for (String s : myTime1) {
            /**
             * for(String s : myTime1){
             *    System.out.println(s);
             * }
             * */
            System.out.println(s);
        }

        String s = "            你是一个大傻逼               ";
        char[] u = s.toCharArray(); //转化为char数组
        for(char ka : u){
            System.out.println(ka);
        }
        s = s.trim();
        System.out.println(s);

        int mz = 1234567;
        String mn = String.valueOf(mz);
        System.out.println(mn+s);

        String k = "1235654854人吗1223";
        System.out.println(k.replaceAll("\\d","可"));
    }
}
