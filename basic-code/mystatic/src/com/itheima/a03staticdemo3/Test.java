package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23,"man");
        Student s2 = new Student("lisi", 84,"woman");
        Student s3 = new Student("wangwu", 25,"man");
        ArrayList<Student> list =new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);

    }
}
