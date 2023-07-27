package com.itheima.a01immutable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo2 {
    public static void main(String[] args) {

        HashMap<String,String> map =new HashMap<>();
        map.put("111","222");
        map.put("1111","222");
        map.put("11111","222");
        map.put("11","222");
        map.put("1","222");
        map.put("2","222");
        map.put("22","222");
        map.put("222","222");
        map.put("2222","222");
        map.put("22222","222");
        map.put("3","222");


        Map<Object, Object> map1 = Map.ofEntries(map.entrySet().toArray(new Map.Entry[0]));
        Map<String, String> map2 = Map.copyOf(map);



    }
}
