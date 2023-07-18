package com.itheima.a02treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {

        TreeMap<Student,String> map = new TreeMap<>();
        map.put(new Student("zhangsan",23),"sichuan");
        map.put(new Student("lisi",24),"chongqing");
        map.put(new Student("zhangsan",24),"shanghai");
        map.put(new Student("zhangsan",23),"zhejiang");

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }

}
