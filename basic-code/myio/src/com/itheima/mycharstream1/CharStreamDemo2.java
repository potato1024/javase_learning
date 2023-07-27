package com.itheima.mycharstream1;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("myio/a.txt");
        int len;
        char[] chars = new char[2];
        while((len=fr.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        fr.close();





    }
}