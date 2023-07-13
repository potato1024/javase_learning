package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A05SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
                /* 需求:
            秒杀活动开始时间:2023年11月11日 0:0:0(毫秒值)
            秒杀活动结束时间:2023年11月11日 0:10:0(毫秒值)

            小贾下单并付款的时间为:2023年11月11日 0:01:0
            小皮下单并付款的时间为:2023年11月11日 0:11:0
            用代码说明这两位同学有没有参加上秒杀活动?
         */

        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String jia = "2023年11月11日 0:01:00";
        String pi = "2023年11月11日 0:11:0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startDate = sdf.parse(start).getTime();
        long endDate = sdf.parse(end).getTime();
        long jiaDate = sdf.parse(jia).getTime();
        long piDate = sdf.parse(pi).getTime();

        if (jiaDate < startDate || jiaDate > endDate) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        if (piDate < startDate || piDate > endDate) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

    }
}
