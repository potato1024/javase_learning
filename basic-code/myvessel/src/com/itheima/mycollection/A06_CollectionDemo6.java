package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A06_CollectionDemo6 {
    public static void main(String[] args) {

        Collection<String> coll =new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");



        for(String s : coll){
            System.out.println(s);
        }



    }
}
