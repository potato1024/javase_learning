package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("myio/gbkfile.txt"), "gbk");
        int ch;
        while((ch= isr.read())!=-1){
            System.out.print((char)ch);
        }
        isr.close();*/

        FileReader fr = new FileReader("myio/gbkfile.txt", Charset.forName("gbk"));
        int ch;
        while((ch= fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();

    }
}
