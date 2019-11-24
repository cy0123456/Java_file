package com.company.Example20;

import java.text.DecimalFormat;

public class DecimalTest01 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###");
        System.out.println(df.format(123567));
        DecimalFormat df1 = new DecimalFormat("###,###.###");
        System.out.println(df1.format(1234568.213));
        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        System.out.println(df2.format(1234567.123));
    }
}
