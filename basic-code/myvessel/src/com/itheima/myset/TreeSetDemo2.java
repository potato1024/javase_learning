package com.itheima.myset;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        TreeSet<Student> set = new TreeSet<>();
        System.out.println(set.add(s3));
        System.out.println(set.add(s2));
        System.out.println(set.add(s1));
        System.out.println(set.add(s4));

        System.out.println(set);

        for (Student student : set) {
            System.out.println(student);
        }
    }
}
