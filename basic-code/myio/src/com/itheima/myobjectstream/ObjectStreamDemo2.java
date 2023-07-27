package com.itheima.myobjectstream;

import java.io.*;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myio/student.txt"));
        Object o = ois.readObject();
        Student s = (Student) o;
        System.out.println(s);
    }
}
