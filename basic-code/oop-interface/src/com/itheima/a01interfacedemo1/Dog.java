package com.itheima.a01interfacedemo1;

public class Dog extends Animal implements Swimming{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat bone");
    }

    @Override
    public void swim() {
        System.out.println("dog swim");
    }
}
