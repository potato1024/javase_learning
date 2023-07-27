package com.itheima.a01myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo5 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/potato/Desktop/aaa/bbb");
        File file2 = new File("/Users/potato/Desktop/aaa/ddd/eee/fff");

        boolean delete = file.delete();
        System.out.println(delete);
        boolean delete1 = file2.delete();
        System.out.println(delete1);

    }
}
