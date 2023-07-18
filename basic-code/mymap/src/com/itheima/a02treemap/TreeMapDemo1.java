package com.itheima.a02treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        //TreeMap<Integer, String> map = new TreeMap<>();
        TreeMap<Integer, String> map = new TreeMap<>((o1, o2) -> o2 - o1);
        map.put(3,"abc");
        map.put(1,"def");
        map.put(2,"get");
        System.out.println(map);
    }

}
