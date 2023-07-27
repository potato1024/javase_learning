package com.itheima.a13waitandnotify;

public class Foodie extends Thread{
    @Override
    public void run() {

        while (true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }
                else{
                    if(Desk.foodFlag==0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    else{
                        Desk.count--;
                        System.out.println("正在吃面，还能再吃"+Desk.count+"碗");
                        Desk.lock.notifyAll();
                        Desk.foodFlag=0;

                    }
                }
            }
        }
    }
}
