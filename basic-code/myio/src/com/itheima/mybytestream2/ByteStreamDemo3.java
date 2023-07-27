package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio/a.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println( b);
        }
        fis.close();
    }
}
