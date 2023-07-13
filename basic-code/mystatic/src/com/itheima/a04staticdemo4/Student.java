package com.itheima.a04staticdemo4;

public class Student {
    String name;
    int age;
    static String teacherName;


    public  void show1(Student this){
        System.out.println("this:"+this);
        System.out.println(this.name+", "+this.age+", "+this.teacherName);

        this.show2();

        this.method();

    }
    public void show2(){
        System.out.println("show2");
    }


    public static void method(){

        //System.out.println(this.name);
        //this.show2();
        System.out.println("static method");
    }
}
