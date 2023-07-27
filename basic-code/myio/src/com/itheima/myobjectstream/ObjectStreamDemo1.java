package com.itheima.myobjectstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        Student s = new Student("zhangsan",23,"nanjing");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio/student.txt"));

        oos.writeObject(s);
        oos.close();
    }
}
