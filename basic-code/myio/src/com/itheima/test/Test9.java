package com.itheima.test;

import java.io.*;
import java.util.ArrayList;

public class Test9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myio/students.txt"));

/*        Student s1 = (Student) ois.readObject();
        Student s2 = (Student) ois.readObject();
        Student s3 = (Student) ois.readObject();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);*/

        ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
