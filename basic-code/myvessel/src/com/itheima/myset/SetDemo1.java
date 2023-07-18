package com.itheima.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("aaa"));
        System.out.println(set.add("aaa"));
        System.out.println(set);

        set.add("bbb");
        set.add("ccc");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        for (String s : set) {
            System.out.println(s);
        }
        set.forEach(s-> System.out.println(s));

    }
}
