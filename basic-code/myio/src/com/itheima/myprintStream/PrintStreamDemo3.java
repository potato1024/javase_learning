package com.itheima.myprintStream;

import java.io.*;

public class PrintStreamDemo3 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("myio/a.txt"), true);
        pw.write(97);
        pw.println(123);
        pw.print(true);
        pw.printf("%s啦啦啦%s", "123", "abc");
        pw.println();
        pw.close();


    }
}
