package com.company.Example25;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        DataInputStream dis = new DataInputStream(new FileInputStream("src\\com\\company\\Example25\\temp05.txt"));
        System.out.println(dis.readByte());
        System.out.println(dis.readShort());
        System.out.println(dis.readInt());
        System.out.println(dis.readLong());
        System.out.println(dis.readFloat());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        dis.close();
    }
}
