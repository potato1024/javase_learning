package com.itheima.myset;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("zhangsan",23,100,99,98);
        Student2 s2 = new Student2("zhangsan",23,100,98,99);
        Student2 s3 = new Student2("zhangsan",23,99,100,98);
        Student2 s4 = new Student2("zhangsan",23,98,100,100);
        Student2 s5 = new Student2("zhangsan",24,100,99,98);
        Student2 s6 = new Student2("zhangsan",25,100,99,98);
        Student2 s7 = new Student2("lisi",23,100,99,98);
        Student2 s8 = new Student2("lisi",23,100,99,98);


        TreeSet<Student2> set = new TreeSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set.add(s7);
        set.add(s8);

        for (Student2 student2 : set) {
            System.out.println(student2);
        }
    }
}
