package com.itheima.a09oopextendsdemo9;

public class Student {
    String name;
    int age;
    String school;

    public Student() {
        this(null,0 ,"hust");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
