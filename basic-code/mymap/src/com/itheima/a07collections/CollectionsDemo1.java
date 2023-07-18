package com.itheima.a07collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
