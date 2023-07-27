package com.itheima.a08threadsafe2;

public class MyRunnable implements Runnable{

    int ticket = 0;
    @Override
    public void run() {

        while(true){
            //synchronized (MyRunnable.class){
                if (method()) break;
            //}

        }
    }

    private synchronized boolean method() {
        if(ticket==100){
            return true;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ticket++;
        System.out.println(Thread.currentThread().getName()+"在卖第"+ticket+"张票");
        return false;
    }
}
