package com.itheima.a13waitandnotify2;

import com.itheima.a13waitandnotify.Desk;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while(true){
            String food = null;
            try {
                food = queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(food);


        }
    }
}
