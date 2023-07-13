package com.itheima.a02abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("green",1);
        System.out.println(f.getName()+", "+f.getAge());
        f.eat();
        f.drink();
    }
}
