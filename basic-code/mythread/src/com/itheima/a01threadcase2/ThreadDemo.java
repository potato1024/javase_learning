package com.itheima.a01threadcase2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();

        Thread t1 = new Thread(myRun);
        Thread t2 = new Thread(myRun);

        t1.setName("thread1");
        t2.setName("thread2");

        t1.start();
        t2.start();



    }
}
