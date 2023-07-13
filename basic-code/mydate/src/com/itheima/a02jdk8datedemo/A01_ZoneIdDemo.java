package com.itheima.a02jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneIdDemo {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds.size());
        System.out.println(availableZoneIds);
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId of = ZoneId.of("America/Marigot");
        System.out.println(of);
    }
}
