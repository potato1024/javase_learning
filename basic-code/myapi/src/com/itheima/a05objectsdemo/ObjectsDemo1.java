package com.itheima.a05objectsdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student("zhangsan",23);


        //boolean result = s1.equals(s2);
        //System.out.println(result);

        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.nonNull(s2));

    }
}
