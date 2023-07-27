package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio/b.txt");
        int read = fis.read();
        System.out.println((char)read);
        fis.close();
    }
}
