package com.itheima.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myio/a.txt",true);
        String str = "abcd123";
        String str2 = "696";
        String swap = "\r";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        fos.write(swap.getBytes());
        fos.write(str2.getBytes());
        fos.close();

    }
}
