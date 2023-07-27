package com.itheima.a04threadmethod2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();

        Thread t1 = new Thread(myRun,"飞机");
        Thread t2 = new Thread(myRun,"坦克");

        /*System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getPriority());
*/
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();



    }
}
