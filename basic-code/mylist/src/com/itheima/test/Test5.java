package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("please input name: ");
            String name = sc.next();
            System.out.println("please input age: ");
            int age = sc.nextInt();
            Student s = new Student(name, age );
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName()+", "+student.getAge());
        }
    }
}
