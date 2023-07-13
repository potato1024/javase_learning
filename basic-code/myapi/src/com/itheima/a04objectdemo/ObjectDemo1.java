package com.itheima.a04objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        Object obj = new Object();
        String string = obj.toString();
        System.out.println(string);

        Student student = new Student("zhangsan",23);
        String string1 = student.toString();
        System.out.println(string1);
    }
}
