package com.itheima.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        //FileInputStream fis = new FileInputStream("myio/img/dizhu.png");
        //FileOutputStream fos = new FileOutputStream("myio/ency.png");
        FileInputStream fis = new FileInputStream("myio/ency.png");
        FileOutputStream fos = new FileOutputStream("myio/redu.png");
        int b;
        while((b=fis.read())!=-1){
            fos.write(b^100);

        }
        fos.close();
        fis.close();




    }
}
