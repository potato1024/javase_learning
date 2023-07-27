package com.itheima.a01myfile;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo9 {
    public static void main(String[] args) throws IOException {


        File file = new File("/Users/potato/Desktop/aaa");
/*        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile()&&pathname.getName().endsWith(".txt");
            }
        });*/
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);
                return file.isFile() && name.endsWith(".txt");
            }
        });
        for (File file1 : files) {
            System.out.println(file1);
        }


    }
}
