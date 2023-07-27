package com.itheima.a02test;

import java.io.File;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/potato/Desktop/aaa");
        long len = getLen(file);
        System.out.println(len);


    }

    public static long getLen(File dir) {
        long len = 0;
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                len = len + file.length();
            } else {
                len = len + getLen(file);
            }
        }

        return len;
    }
}
