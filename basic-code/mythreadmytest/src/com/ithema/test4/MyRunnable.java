package com.ithema.test4;

import java.util.Random;

public class MyRunnable implements Runnable {
    int money = 100;
    int count = 0;

    @Override
    public void run() {

        synchronized (MyRunnable.class) {
            count++;


            if (count < 3) {

                Random r = new Random();
                int i = r.nextInt(money) + 1;
                System.out.println(Thread.currentThread().getName() + "抢到了" + i + "元");
                money = money - i;
            } else if (count == 3) {

                System.out.println(Thread.currentThread().getName() + "抢到了" + money + "元");
            } else {
                System.out.println(Thread.currentThread().getName() + "没抢到");
            }


        }

    }
}
