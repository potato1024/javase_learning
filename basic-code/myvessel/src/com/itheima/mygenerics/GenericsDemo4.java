package com.itheima.mygenerics;

public class GenericsDemo4 {
    public static void main(String[] args) {

        MyArrayList2 list = new MyArrayList2();
        list.add("aaa");

        MyArrayList3<Integer> list3 = new MyArrayList3<>();

        list3.add(32);
    }
}
