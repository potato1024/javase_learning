package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio/img/dizhu.png");
        FileOutputStream fos = new FileOutputStream("myio/copy.png");
        int b;
        while((b=fis.read())!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();

    }
}
