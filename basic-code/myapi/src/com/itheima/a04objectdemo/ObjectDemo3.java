package com.itheima.a04objectdemo;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String s1 = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s1.equals(sb));
        System.out.println(sb.equals(s1));

    }
}
