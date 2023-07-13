package com.itheima.a06interfacedemo6;

public interface Inter {
    void method();
    public default void show(){
        System.out.println("----------");
    }
}
