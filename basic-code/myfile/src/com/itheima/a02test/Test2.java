package com.itheima.a02test;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/potato/Desktop/aaa");
        boolean b = find(file);
        System.out.println(b);


    }
    public  static  boolean find(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            //System.out.println(file1);
            if(file1.isFile()&&file1.getName().endsWith(".avi")){
                return true;
            }
        }
        return false;

    }
}
