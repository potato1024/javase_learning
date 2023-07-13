package com.itheima.a08regexdemo;

public class RegexDemo5 {
    public static void main(String[] args) {
        String regex1 = "\\w{4,16}";

        System.out.println("zhangsan".matches(regex1));

        String regex2 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("51102419990101123X".matches(regex2));

        String regex3= "a(?i)bc";
        System.out.println("aBC".matches(regex3));

        String regex4 = "[1-9]\\d{5}(18|19|20)\\d{2}(0\\d|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        System.out.println("51102415990101123X".matches(regex4));
    }
}
