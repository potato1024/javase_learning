package com.itheima.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/potato/Desktop/a.txt");
        File dest = new File("/Users/potato/Desktop");
        tozip(src,dest);


    }
    public static void tozip(File src,File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        ZipEntry zipEntry = new ZipEntry("a.txt");
        zos.putNextEntry(zipEntry);
        FileInputStream fis = new FileInputStream(src);
        int b ;
        while ((b= fis.read())!=-1){
            zos.write(b);
        }

        zos.closeEntry();
        zos.close();
    }
}
