package com.itheima.a02treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {


        String str = "aababcabcdabcde";
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entries) {
            sb.append(entry.getKey()).append("(").append(entry.getValue()).append(")");
        }
        System.out.println(sb);

    }

}
