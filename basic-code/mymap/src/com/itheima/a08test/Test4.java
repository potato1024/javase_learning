package com.itheima.a08test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list1,"Hefei","Wuhu","Maanshan","Nanjing");
        Collections.addAll(list2,"Wuhan","Xiantao","Yichang","Enshi");
        Collections.addAll(list3,"Sichuan","Chongqing","Mianyang","Leshan");
        map.put("Anhui",list1);
        map.put("Hubei",list2);
        map.put("Chengdu",list3);

        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(", ",key+" = ","");

            for (String s : value) {
                sj.add(s);
            }
            System.out.println(sj);
        }


    }
}
