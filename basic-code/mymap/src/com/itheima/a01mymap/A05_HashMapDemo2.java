package com.itheima.a01mymap;

import java.util.*;

public class A05_HashMapDemo2 {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            list.add(arr[r.nextInt(arr.length)]);
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : list) {

            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        System.out.println(map);

        int max = 0;
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (value > max) {
                max = value;
            }

        }


        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            if (value == max) {
                System.out.println(entry.getKey());
            }
        }

    }
}
