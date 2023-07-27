package com.itheima.a02test;

import java.io.File;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/potato/Desktop/aaa");
        delete(file);


    }

    public static void delete(File dir) {
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    delete(file);
                }
            }


        }



    }


}
