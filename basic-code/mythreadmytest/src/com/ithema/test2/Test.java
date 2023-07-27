package com.ithema.test2;

import com.ithema.test1.MyThread;

public class Test {
    public static void main(String[] args) {

        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr,"线程A");
        Thread t2 = new Thread(mr,"线程B");


        t1.start();
        t2.start();
    }
}
