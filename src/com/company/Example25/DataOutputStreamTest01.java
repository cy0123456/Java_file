package com.company.Example25;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src\\com\\company\\Example25\\temp05.txt"));
        byte b = 10;
        short s= 11;
        int i = 12;
        long l = 1000L;
        float f = 3.2f;
        double d = 2.0;
        boolean flag = false;
        char c = 'a';
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(flag);
        dos.writeChar(c);

        dos.flush();
        dos.close();

    }
}
