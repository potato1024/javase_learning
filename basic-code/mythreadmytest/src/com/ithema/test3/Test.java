package com.ithema.test3;


public class Test {
    public static void main(String[] args) {


        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "线程A");
        Thread t2 = new Thread(mr, "线程B");


        t1.start();
        t2.start();
    }
}
