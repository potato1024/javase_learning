package com.itheima.a06innerclassdemo6;

public class Test2 {
    public static void main(String[] args) {
        Swim swim = new Swim() {
            @Override
            public void swim() {
                System.out.println("swim");
            }
        };
        swim.swim();


        new Swim() {
            @Override
            public void swim() {
                System.out.println("swim");
            }
        }.swim();

    }
}
