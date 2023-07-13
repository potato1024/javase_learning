package com.itheima.a06interfacedemo6;

public class InterImpl implements Inter,Inter2{
    @Override
    public void method() {
        System.out.println("override");
    }

    @Override
    public void show() {
        Inter.super.show();
    }
}
