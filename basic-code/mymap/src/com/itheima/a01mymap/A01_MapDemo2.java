package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A01_MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","2");
        map.put("3","4");
        map.put("5","6");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            //System.out.println(key);

            String value = map.get(key);
            System.out.println(key+" = "+value);

        }


    }
}
