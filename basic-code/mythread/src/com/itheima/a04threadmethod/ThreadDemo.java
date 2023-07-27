package com.itheima.a04threadmethod;


public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("坦克");

        t1.start();
        t2.start();

        /*Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        System.out.println("11111");

        Thread.sleep(5000);

        System.out.println("222222");*/



    }
}
