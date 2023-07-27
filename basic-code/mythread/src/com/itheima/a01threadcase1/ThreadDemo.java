package com.itheima.a01threadcase1;

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();
    }
}
