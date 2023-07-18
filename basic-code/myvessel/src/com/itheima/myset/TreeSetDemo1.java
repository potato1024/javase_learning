package com.itheima.myset;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(6);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(5);
        set.add(2);

        System.out.println(set);

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
