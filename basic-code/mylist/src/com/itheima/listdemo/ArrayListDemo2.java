package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //boolean result = list.remove("aba");
        //String result = list.remove(5);
        //String result = list.set(1, "ddd");
//        String result = list.get(0);
//
//
//        System.out.println(result);
//        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
