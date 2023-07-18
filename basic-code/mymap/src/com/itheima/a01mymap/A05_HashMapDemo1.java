package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class A05_HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<Student,String> map = new HashMap<>();
        map.put(new Student("zhangsan",23),"sichuan");
        map.put(new Student("lisi",24),"chongqing");
        map.put(new Student("wangwu",25),"hubei");
        map.put(new Student("wangwu",25),"anhui");

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }


    }
}
