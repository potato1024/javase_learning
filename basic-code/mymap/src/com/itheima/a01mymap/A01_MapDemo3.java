package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A01_MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","2");
        map.put("3","4");
        map.put("5","6");


        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}
