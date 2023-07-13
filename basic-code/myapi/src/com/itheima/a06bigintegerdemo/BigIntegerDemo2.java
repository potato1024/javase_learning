package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        BigInteger bd1 = BigInteger.valueOf(100);
        BigInteger bd2 = BigInteger.valueOf(7);
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2));

        BigInteger[] bigIntegers = bd1.divideAndRemainder(bd2);
        System.out.println(bigIntegers[0]);
        System.out.println(bigIntegers[1]);

        System.out.println(bd1.equals(bd2));
        System.out.println(bd1.pow(2));
        System.out.println(bd1.max(bd2));
        System.out.println(bd1.min(bd2));
        int i = bd1.intValue();
        System.out.println(i);


    }
}
