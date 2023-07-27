package com.ithema.test4;
public class Test {
    public static void main(String[] args) {


        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr, "线程A");
        Thread t2 = new Thread(mr, "线程B");
        Thread t3 = new Thread(mr, "线程C");
        Thread t4 = new Thread(mr, "线程D");
        Thread t5 = new Thread(mr, "线程E");


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
