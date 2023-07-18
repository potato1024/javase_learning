package com.itheima.mygenerics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        ListUtil.addAll(list,"aaa","bbb","ccc","ddd");
        System.out.println(list);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        ListUtil.addAll2(list2,111,222,333,444);
        ListUtil.addAll2(list2,111,222);

        System.out.println(list2);
    }
}
