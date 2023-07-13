package com.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23, "man");
        Student.teacherName = "awei";
        s1.study();
        s1.show();
        Student s2 = new Student("lisi", 24, "woman");
        s2.study();
        s2.show();
    }


}
