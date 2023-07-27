package com.itheima.a13waitandnotify2;

import com.itheima.a13waitandnotify.Desk;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends  Thread{

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                queue.put("面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("厨师做了一碗面");

        }
    }
}
