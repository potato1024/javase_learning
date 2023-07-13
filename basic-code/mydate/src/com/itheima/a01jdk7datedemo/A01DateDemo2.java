package com.itheima.a01jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class A01DateDemo2 {
    public static void main(String[] args) {
        //extracted();

        Random r = new Random();

        Date d1 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d2);

        long time1 = d1.getTime();
        long time2 = d2.getTime();
        if(time1<time2){
            System.out.println("第一个时间在前");
        }else if(time1>time2){
            System.out.println("第二个时间在前");
        }else{
            System.out.println("两个时间一样");
        }
    }

    private static void extracted() {
        Date d1 = new Date(0);
        long time = d1.getTime();
        time += 1000L * 60 * 60 * 24 * 365;
        d1.setTime(time);
        System.out.println(d1);
    }
}
