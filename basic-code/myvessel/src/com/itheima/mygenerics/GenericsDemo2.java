package com.itheima.mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        String s = list.get(1);
        System.out.println(s);

        System.out.println(list);


        MyArrayList<Integer> list2 = new MyArrayList<>();

        list2.add(111);
        list2.add(222);
        list2.add(333);

        int i = list2.get(0);
        System.out.println(i);

        System.out.println(list2);

    }
}
