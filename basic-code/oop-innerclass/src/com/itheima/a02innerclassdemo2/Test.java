package com.itheima.a02innerclassdemo2;

public class Test {
    public static void main(String[] args) {

        Outer o = new Outer();
        Object instance = o.getInstance();
        System.out.println(instance);
    }
}
