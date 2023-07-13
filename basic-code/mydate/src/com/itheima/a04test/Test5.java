package com.itheima.a04test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) {
        /*
            判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:
            二月有29天是闰年一年有366天是闰年
        */

        Calendar c = Calendar.getInstance();
        c.set(2000, Calendar.MARCH,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int i = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);

        LocalDate ld = LocalDate.of(2000,3,1);
        LocalDate localDate = ld.minusDays(1);
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println(dayOfMonth);

        System.out.println(ld.isLeapYear());

    }
}
