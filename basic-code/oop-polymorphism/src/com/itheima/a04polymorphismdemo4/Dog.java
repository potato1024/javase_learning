package com.itheima.a04polymorphismdemo4;

public class Dog extends Animal{
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的抱住"+something+"猛吃");
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }
}
