package com.itheima.a01myfile;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/potato/Desktop/aaa/bbb");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);

        File file2 = new File("/Users/potato/Desktop/aaa/ddd/eee/fff");
        boolean mkdir = file2.mkdir();
        System.out.println(mkdir);

        boolean mkdirs = file2.mkdirs();
        System.out.println(mkdirs);

    }
}
