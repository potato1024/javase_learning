package com.itheima.a08interfacedemo8;

public interface InterA {
    default void show1(){
        System.out.println("show1");
        log();
    }

    default void show2(){
        System.out.println("show2");
        log();
    }

    static void show3(){
        System.out.println("show1");
        log2();
    }

    static void show4(){
        System.out.println("show2");
        log2();
    }

    private void log(){
        System.out.println("_____________");
    }

    private static void log2(){
        System.out.println("++++++++++++");
    }
}
