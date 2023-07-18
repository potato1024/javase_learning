package com.itheima.a01mymap;

import java.util.*;

public class A07_LInkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("c",3);
        map.put("a",1);
        map.put("b",2);
        map.put("d",4);

        System.out.println(map);
    }
}
