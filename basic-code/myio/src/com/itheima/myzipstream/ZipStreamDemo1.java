package com.itheima.myzipstream;

import java.io.*;
import java.security.PublicKey;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/potato/Desktop/aaa.zip");
        File dest = new File("/Users/potato/Desktop/bbb");
        unzip(src,dest);


    }
    public static void unzip(File src,File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        for (int i = 0; i < 100; i++) {
            ZipEntry nextEntry;
            while((nextEntry=zis.getNextEntry())!=null){
                if(nextEntry.isDirectory()){
                    File file = new File(dest,nextEntry.toString());
                    file.mkdirs();
                }else {
                    FileOutputStream fos= new FileOutputStream(new File(dest,nextEntry.toString()));

                    int b;
                    while((b= zis.read())!=-1){
                        fos.write(b);

                    }
                    fos.close();
                    zis.closeEntry();

                }

            }
        }
        zis.close();

    }
}
