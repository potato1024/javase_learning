package com.itheima.a01immutable;

import java.util.List;

public class ImmutableDemo {
    public static void main(String[] args) {
        List<String> list = List.of("zhangsan", "list", "wangwu");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("-------------");
        for (String s : list) {
            System.out.println(s);
        }

        list.add("aaa");
        list.remove("list");
        list.set(0,"bbb");


    }
}
