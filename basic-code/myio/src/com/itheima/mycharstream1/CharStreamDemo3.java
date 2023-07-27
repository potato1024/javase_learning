package com.itheima.mycharstream1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("myio/a.txt",true);
        //fw.write(25105);

        //fw.write("你好吗？？？");
        char[] chars = {'a','b','c','我'};
        fw.write(chars,1,3);
        fw.close();





    }
}