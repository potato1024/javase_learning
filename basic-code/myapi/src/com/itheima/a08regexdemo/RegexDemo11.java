package com.itheima.a08regexdemo;

public class RegexDemo11 {
    public static void main(String[] args) {

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String s2 = "小诗诗a小丹丹a小惠惠";

        String result = s.replaceAll("[\\w&&[^_]]+", "vs");

        System.out.println(result);

        String[] as = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < as.length; i++) {
            System.out.println(as[i]);
        }
    }
}
