package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo3 {
    public static void main(String[] args) {
        BigDecimal bd1= BigDecimal.valueOf(10.0);
        BigDecimal bd2= BigDecimal.valueOf(3.0);

        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd2.multiply(bd2));
        //System.out.println(bd1.divide(bd2));
        //System.out.println(bd1.divide(bd2, 2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP));

    }
}
