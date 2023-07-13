package com.itheima.a04polymorphismdemo4;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog) {
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+animal.getColor()+"颜色的"+animal.getAge()+"岁的狗");
        }else {
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+animal.getColor()+"颜色的"+animal.getAge()+"岁的猫");
        }
        animal.eat(something);
    }
}
