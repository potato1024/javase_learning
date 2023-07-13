package com.itheima.a04innerclassdemo4;

public class Test {
    public static void main(String[] args) {

        Outer.Inner oi = new Outer.Inner();
        oi.show1();
        Outer.Inner.show2();
    }
}
