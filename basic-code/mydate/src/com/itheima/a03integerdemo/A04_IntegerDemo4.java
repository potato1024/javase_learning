package com.itheima.a03integerdemo;

public class A04_IntegerDemo4 {
    public static void main(String[] args) {
        /*
            public static string tobinarystring(int i) 得到二进制
            public static string tooctalstring(int i) 得到八进制
            public static string toHexstring(int i) 得到十六进制
            public static int parseInt(string s) 将字符串类型的整数转成int类型的整数
        */

        String binaryString = Integer.toBinaryString(100);
        System.out.println(binaryString);
        String octalString = Integer.toOctalString(100);
        System.out.println(octalString);
        String hexString = Integer.toHexString(100);
        System.out.println(hexString);

        int i = Integer.parseInt("123");

        i++;
        System.out.println(i);


    }
}
