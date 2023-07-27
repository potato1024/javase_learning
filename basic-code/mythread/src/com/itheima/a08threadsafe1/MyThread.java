package com.itheima.a08threadsafe1;

public class MyThread extends Thread {
    static int ticket = 0;
    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (ticket < 1000) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
