package com.itheima.a03threadextra;

public class ThreadStateDemo03case2 {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();

        Thread t1 = new Thread(()->{
            synchronized (obj){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();


        Thread t2 = new Thread(()->{
            System.out.println("线程开启之后的状态" + Thread.currentThread().getState());
            synchronized (obj){
                System.out.println("进入之后的状态" + Thread.currentThread().getState());
            }
        });



        System.out.println("创建线程对象后,但是不调用start方法的状态" + t2.getState());
        t2.start();
        Thread.sleep(100);
        System.out.println(t2.getState());
        Thread.sleep(2000);
        System.out.println(t2.getState());
    }
}