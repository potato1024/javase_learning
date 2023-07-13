package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstanceDemo {
    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println(now);


        Instant instant = Instant.ofEpochMilli(0L);
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochSecond(1L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant2);

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);

        System.out.println(instant4.isAfter(instant3));

        Instant now1 = Instant.now();
        System.out.println(now1);
        Instant instant5 = now1.minusSeconds(3600L);
        System.out.println(instant5);

        Instant instant6 = now1.plusMillis(1000L * 1800);
        System.out.println(instant6);


    }
}
