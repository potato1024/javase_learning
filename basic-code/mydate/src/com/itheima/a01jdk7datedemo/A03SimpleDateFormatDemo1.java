package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        //extracted();
        String str = "2023-01-01 01:01:01";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(str);
        System.out.println(d);


    }

    private static void extracted() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(new Date(0)));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS EE");
        System.out.println(sdf2.format(new Date(0)));
    }
}
