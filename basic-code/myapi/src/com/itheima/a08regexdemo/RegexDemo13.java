package com.itheima.a08regexdemo;

public class RegexDemo13 {
    public static void main(String[] args) {
        String str = "我要学学编编编编程程程程程程";
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }
}
