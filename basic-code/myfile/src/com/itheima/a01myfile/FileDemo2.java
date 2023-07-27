package com.itheima.a01myfile;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("/Users/potato/Desktop/aaa");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println("---------");

        File file2 = new File("/Users/potato/Desktop/a.txt");
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.exists());
        System.out.println("----------");

        File file3 = new File("/Users/potato/Desktop/c.txt");
        System.out.println(file3.isDirectory());
        System.out.println(file3.isFile());
        System.out.println(file3.exists());

    }
}
