package com.itheima.mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        list.add(1,"qqq");

        String remove = list.remove(3);
        System.out.println(remove);

        list.set(0,"ttt");


        System.out.println(list);

        String s = list.get(0);
        System.out.println(s);


    }
}
