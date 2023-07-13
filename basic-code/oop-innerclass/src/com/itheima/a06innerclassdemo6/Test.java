package com.itheima.a06innerclassdemo6;

public class Test {
    public static void main(String[] args) {
/*        new Swim(){

            @Override
            public void swim() {
                System.out.println("eat");
            }
        };


        new Animal(){

            @Override
            public void eat() {
                System.out.println("eat");
            }
        };*/

        method(new Animal() {
            @Override
            public void eat() {
                System.out.println("eat");
            }
        });


    }

    public static void method(Animal a){
        a.eat();
    }
}
