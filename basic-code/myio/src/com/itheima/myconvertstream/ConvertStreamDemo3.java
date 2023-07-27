package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {

/*        InputStreamReader isr = new InputStreamReader(new FileInputStream("myio/b.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myio/d.txt"), "utf-8");

        int ch;
        while ((ch = isr.read()) != -1) {
            osw.write(ch);

        }
        osw.close();
        isr.close();*/

        FileReader fr = new FileReader("myio/b.txt",Charset.forName("gbk"));
        FileWriter fw = new FileWriter("myio/e.txt",Charset.forName("utf-8"));
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);

        }
        fw.close();
        fr.close();
    }
}
