package com.itheima.a01jdk7datedemo;

import java.util.Calendar;
import java.util.Date;

public class A06CalendarDemo {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);

        Date d = new Date(0);
        ca.setTime(d);
        System.out.println(ca);

        long timeInMillis = ca.getTimeInMillis();
        System.out.println(timeInMillis);
        ca.setTimeInMillis(1000L);


        ca.set(Calendar.YEAR, 2023);
        ca.set(Calendar.MONTH, 8);
        ca.set(Calendar.DAY_OF_MONTH, 10);
        ca.add(Calendar.MONTH, -1);

        int year = ca.get(Calendar.YEAR);
        int month = ca.get(Calendar.MONTH) + 1;
        int day = ca.get(Calendar.DATE);
        int week = ca.get(Calendar.DAY_OF_WEEK);


        System.out.println(year + ", " + month + ", " + day + ", " + getWeek(week));

    }

    public static String getWeek(int index) {
        String[] arr = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return arr[index - 1];
    }
}
