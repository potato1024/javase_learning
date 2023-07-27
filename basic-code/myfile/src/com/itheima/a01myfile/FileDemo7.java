package com.itheima.a01myfile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo7 {
    public static void main(String[] args) throws IOException {
/*
        File[] files = File.listRoots();
        for (File file : files) {
            System.out.println(file);
        }

        File file = new File("/Users/potato/Desktop/aaa");
        String[] list = file.list();
        for (String file1 : list) {
            System.out.println(file1);
        }*/

        File file = new File("/Users/potato/Desktop/aaa");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File str = new File(dir , name);
                return str.isFile() && name.endsWith(".txt");
            }
        });
        for (String s : list) {
            System.out.println(s);
        }

    }
}
