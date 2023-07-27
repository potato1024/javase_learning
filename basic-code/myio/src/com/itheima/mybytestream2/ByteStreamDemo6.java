package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio/a.txt");
        FileOutputStream fos = new FileOutputStream("myio/copy.txt");
        int len;
        byte[] bytes = new byte[2];
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();

    }
}
