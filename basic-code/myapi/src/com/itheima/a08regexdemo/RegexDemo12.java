package com.itheima.a08regexdemo;

public class RegexDemo12 {
    public static void main(String[] args) {
        //举例: a123a b456b 17891 &abc& a123b(false)
        String regex = "(.).*\\1";

        System.out.println("a123a".matches(regex));
        System.out.println("b456b".matches(regex));
        System.out.println("17891".matches(regex));
        System.out.println("&abc&".matches(regex));
        System.out.println("a123b".matches(regex));

        System.out.println("---------------------");


        //举例: abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)
        String regex2 = "(.+).*\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abd".matches(regex2));

        System.out.println("---------------------");

        //aaa123aaa bbb456bbb 111789111 &&abc&&
        String regex3 = "((.)\\2*).*\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        System.out.println("aaa123aab".matches(regex3));




    }
}
