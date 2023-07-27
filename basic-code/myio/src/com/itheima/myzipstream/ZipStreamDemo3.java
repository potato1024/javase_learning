package com.itheima.myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File src = new File("/Users/potato/Desktop/aaa");
        File dest = new File(src.getParentFile(),src.getName()+".zip");
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        tozip(src,zos,src.getName());
        zos.close();


    }
    public static void tozip(File src,ZipOutputStream zos,String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            //if (!file.getName().equals(".DS_Store")) {
                if(file.isFile()){
                   ZipEntry zipEntry= new ZipEntry(name+"/"+file.getName());
                   zos.putNextEntry(zipEntry);
                   FileInputStream fis = new FileInputStream(file);
                   int b ;
                   while((b=fis.read())!=-1){
                       zos.write(b);
                   }
                   fis.close();
                   zos.closeEntry();
                }
                else {
                    tozip(file,zos,name+"/"+file.getName());

                }
            //}

        }


    }
}
