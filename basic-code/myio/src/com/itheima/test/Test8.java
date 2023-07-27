package com.itheima.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Test8 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("zhangsan",23,"beijing");
        Student s2 = new Student("lisi",24,"shanghai");
        Student s3 = new Student("wangwu",25,"guangzhou");


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio/students.txt"));

/*        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);*/

        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list, s1, s2, s3);
        oos.writeObject(list);


        oos.close();
    }
}
