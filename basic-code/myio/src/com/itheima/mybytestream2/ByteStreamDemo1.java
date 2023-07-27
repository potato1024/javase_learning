package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio/a.txt");
        int read = fis.read();
        System.out.println((char)read);
        fis.close();
    }
}
