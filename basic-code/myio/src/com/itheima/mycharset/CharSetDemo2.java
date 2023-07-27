package com.itheima.mycharset;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "ai你哟";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        String string = new String(bytes);
        System.out.println(string);


        String string2 = new String(bytes,"GBK");
        System.out.println(string2);

        String string3 = new String(bytes2,"GBK");
        System.out.println(string3);

    }
}
