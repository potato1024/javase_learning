package com.itheima.a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        //Person p = new Person();

        Student student = new Student("zhangsan",23);
        System.out.println(student.getName()+", "+student.getAge());

    }
}
