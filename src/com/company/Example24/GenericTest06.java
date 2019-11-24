package com.company.Example24;

public class GenericTest06 {
    public static void main(String[] args) {
        String[] ins = {"啊啊啊","从vvv","xzc"};
        StringBuffer sb = new StringBuffer();
        for (String v : ins){
            sb.append(v);
            sb.append(",");
        }

        System.out.println(sb.substring(0,sb.length()-1));
    }
}
