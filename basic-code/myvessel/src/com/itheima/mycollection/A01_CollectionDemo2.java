package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo2 {
    public static void main(String[] args) {

        Collection<Student> coll =new ArrayList<>();
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("zhangsan",23);
        coll.add(s1);

        boolean contains = coll.contains(s2);
        System.out.println(contains);

    }
}
