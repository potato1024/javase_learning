package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        System.out.println(coll);

        //coll.clear();
        System.out.println(coll);

        coll.remove("aaa");
        System.out.println(coll.remove("ddd"));
        System.out.println(coll);

        boolean ccc = coll.contains("ccc");
        System.out.println(ccc);
        System.out.println(coll.contains("aaa"));

        //coll.clear();
        System.out.println(coll.isEmpty());


        System.out.println(coll.size());
        coll.add("ddd");
        System.out.println(coll.size());
    }
}
