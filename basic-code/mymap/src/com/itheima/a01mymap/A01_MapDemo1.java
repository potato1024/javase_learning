package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","2");
        map.put("3","4");
        System.out.println(map.put("5", "6"));
        String put = map.put("3", "0");
        System.out.println(put);


        //String remove = map.remove("1");
        //System.out.println(remove);

        //map.clear();

/*        boolean b = map.containsKey("1");
        System.out.println(b);

        boolean b1 = map.containsValue("4");
        System.out.println(b1);*/

        /*boolean empty = map.isEmpty();
        System.out.println(empty);*/

        System.out.println(map.size());
        System.out.println(map);

    }
}
