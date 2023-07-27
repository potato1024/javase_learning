package com.ithema.test1;

public class MyThread extends Thread{
    static int ticket=1000;

    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if(ticket==0){
                    break;
                }
                else {
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(getName()+"正在卖票，还剩下"+(ticket)+"张票");
                }
            }
        }
    }
}
