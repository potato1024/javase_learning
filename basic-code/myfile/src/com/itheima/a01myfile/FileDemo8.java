package com.itheima.a01myfile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo8 {
    public static void main(String[] args) throws IOException {


        File file = new File("/Users/potato/Desktop/aaa");
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()&&file1.getName().endsWith(".txt")){
                System.out.println(file1);
            }
        }


    }
}
