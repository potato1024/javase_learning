package com.ithema.test3;

public class MyRunnable implements Runnable {
     int i = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (MyRunnable.class) {
                if (i == 100) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                    if (i % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + "输出了" + i);
                    }
                }
            }
        }
    }
}
