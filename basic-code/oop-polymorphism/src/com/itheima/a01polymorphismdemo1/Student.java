package com.itheima.a01polymorphismdemo1;

public class Student extends Person{
    @Override
    public void show(){
        System.out.println("student info: "+getName()+", "+getAge());
    }
}
