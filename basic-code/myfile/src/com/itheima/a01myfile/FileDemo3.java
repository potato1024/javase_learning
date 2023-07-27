package com.itheima.a01myfile;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("/Users/potato/Desktop/a.txt");
        File file2 = new File("/Users/potato/Desktop/aaa");
        File file3 = new File("myfile/a.txt");
        System.out.println(file.length());
        System.out.println(file2.length());
        System.out.println("------------");


        System.out.println(file.getAbsolutePath());
        System.out.println(file3.getAbsolutePath());
        System.out.println("------------");


        System.out.println(file.getPath());
        System.out.println(file3.getPath());
        System.out.println("------------");


        System.out.println(file.getName());
        System.out.println(file2.getName());
        System.out.println("------------");

        long l = file.lastModified();
        Instant instant = Instant.ofEpochMilli(l);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(instant.atZone(ZoneId.systemDefault())));



    }
}
