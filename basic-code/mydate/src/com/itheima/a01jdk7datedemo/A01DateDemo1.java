package com.itheima.a01jdk7datedemo;

import java.util.Date;

public class A01DateDemo1 {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        Date d2 = new Date(0L);
        System.out.println(d2);

        d2.setTime(1000L);
        System.out.println(d2);

        long time = d2.getTime();
        System.out.println(time);

    }
}
