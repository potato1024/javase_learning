package com.itheima.myiotest9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();


        FileInputStream fis = new FileInputStream("myiotest/a.properties");

        p.load(fis);
        fis.close();
        System.out.println(p);


    }
}
