package com.itheima.myprintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class PrintStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps = new PrintStream(new FileOutputStream("myio/a.txt"), true, "utf-8");
        ps.write(97);
        ps.println(123);
        ps.print(true);
        ps.printf("%s啦啦啦%s", "123", "abc");
        ps.println();
        ps.close();


    }
}
