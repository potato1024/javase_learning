package com.itheima.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("myio/a.txt");
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();





    }
}