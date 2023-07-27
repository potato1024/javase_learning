package com.ithema.test5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{

    //{10,5,20,50,100,200,500,800,2,80,300,700}

    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list=list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if(list.isEmpty()){
                    break;
                }
                else {
                    Collections.shuffle(list);
                    int prize = list.get(0);
                    list.remove(0);
                    System.out.println(getName()+" 又产生了一个 "+prize+" 元大奖");
                    Thread.yield();
                }

            }
        }
    }
}
