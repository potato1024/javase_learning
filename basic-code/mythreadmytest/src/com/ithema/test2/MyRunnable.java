package com.ithema.test2;

public class MyRunnable implements Runnable{
      int gift =100;

    @Override
    public void run() {
        while (true){
            synchronized (MyRunnable.class){
                if(gift<10){
                    break;
                }
                else {
                    gift--;
                    System.out.println(Thread.currentThread().getName()+"正在送礼品，还剩下"+gift+"份礼品");
                }
            }
        }

    }
}
