package com.itheima.a01myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo6 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/potato/Desktop/aaa");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

    }
}
