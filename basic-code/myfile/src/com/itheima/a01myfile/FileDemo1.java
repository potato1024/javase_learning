package com.itheima.a01myfile;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        String str = "/Users/potato/Desktop/a.txt";
        File file = new File(str);
        System.out.println(file);


        String parent = "/Users/potato/Desktop";
        String child = "a.txt";
        File file2 =new File(parent,child);
        System.out.println(file2);


        File parent2 = new File("/Users/potato/Desktop");
        File file3 = new File(parent2,child);
        System.out.println(file3);






    }
}
