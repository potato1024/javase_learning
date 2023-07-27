package com.itheima.a02test;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/potato/Desktop/aaa");
        find(file);


    }

    public static void find(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isFile()) {
                    if (file1.getName().endsWith(".avi")) {
                        System.out.println(file1);
                    }
                } else {
                    find(file1);
                }

            }
        }


    }
}
