package com.itheima.myset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;


        }
        );
        set.add("c");
        set.add("ab");
        set.add("df");
        set.add("qwer");

        System.out.println(set);
    }
}
