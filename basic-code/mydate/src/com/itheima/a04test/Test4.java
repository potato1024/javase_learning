package com.itheima.a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成

        String birth = "1998年6月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birth);
        long time = date.getTime();
        long l = System.currentTimeMillis();
        long l1 = l - time;
        long day = l1 / 1000 / 3600 / 24;
        System.out.println(day);



        LocalDate ld = LocalDate.of(1998,6,1);
        LocalDate now = LocalDate.now();

        long between = ChronoUnit.DAYS.between(ld, now);

        System.out.println(between);


    }
}
