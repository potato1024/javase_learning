package com.itheima.mybytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myio/a.txt");
        byte[] b = {97,98,99,100,101};
        //fos.write(b);
        fos.write(b,1,3);
        fos.close();

    }
}
