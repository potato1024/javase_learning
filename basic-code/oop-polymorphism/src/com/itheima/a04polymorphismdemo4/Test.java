package com.itheima.a04polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);

        Cat c = new Cat();

        c.setAge(3);
        c.setColor("灰");
        Dog d = new Dog();
        d.setAge(2);
        d.setColor("黑");

        p1.keepPet(d,"骨头");
        p2.keepPet(c,"鱼");
    }


}
