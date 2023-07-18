package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class A07_CollectionDemo7 {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");


        coll.forEach(s -> System.out.println(s));


    }
}
