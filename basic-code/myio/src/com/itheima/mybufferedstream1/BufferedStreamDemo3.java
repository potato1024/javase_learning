package com.itheima.mybufferedstream1;

import java.io.*;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio/a.txt"));

        String line;
        while((line= br.readLine())!=null){
        System.out.println(line);}
        br.close();
    }

}
