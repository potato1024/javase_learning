package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
/*        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myio/b.txt"),"gbk");
        osw.write("你好你好");
        osw.close();*/

        FileWriter fw = new FileWriter("myio/c.txt",Charset.forName("gbk"));
        fw.write("你好你好");
        fw.close();

    }
}
