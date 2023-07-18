package com.itheima.mygenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        //list.add(123);
        list.add("abc");
        //list.add(new Student("zhangsan",23));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            //next.length;
            System.out.println(next);

        }
    }
}
