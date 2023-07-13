package com.itheima.a04innerclassdemo4;

public class Outer {
    int a = 10;
    static int b =20;

    static class Inner{
        public void show1(){
            System.out.println("not static method");
            System.out.println(b);
            Outer o =new Outer();
            System.out.println(o.a);
        }

        public static void show2(){
            System.out.println("static method");
            System.out.println(b);
            Outer o =new Outer();
            System.out.println(o.a);
        }
    }
}
