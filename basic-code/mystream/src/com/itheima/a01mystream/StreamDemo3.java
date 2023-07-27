package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StreamDemo3 {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);

        map.keySet().stream().forEach(s -> System.out.println(s+" = "+map.get(s)));
        map.entrySet().stream().forEach(s -> System.out.println(s.getKey()+" = "+s.getValue()));

        


    }
}
