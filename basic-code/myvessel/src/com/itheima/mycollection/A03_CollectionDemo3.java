package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_CollectionDemo3 {
    public static void main(String[] args) {

        Collection<String> coll =new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");


        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String next =  it.next();


        }

    }
}
