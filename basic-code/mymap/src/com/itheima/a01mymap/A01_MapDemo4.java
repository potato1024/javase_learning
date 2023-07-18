package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A01_MapDemo4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("3", "4");
        map.put("5", "6");

        map.forEach((key, value) -> System.out.println(key + " = " + value));



    }
}
