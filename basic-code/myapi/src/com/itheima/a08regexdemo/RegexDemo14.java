package com.itheima.a08regexdemo;

public class RegexDemo14 {
    public static void main(String[] args) {
        //String regex1 ="[1-9]\\d{16}(?:\\d|x|x)\\1";
        String regex1 ="[1-9]\\d{16}(\\d|x|x)\\1";
        System.out.println("41080119930228457x".matches(regex1));
    }
}
