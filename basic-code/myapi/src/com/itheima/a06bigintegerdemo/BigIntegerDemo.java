package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo {
    public static void main(String[] args) {
/*        for (int i = 0; i < 10; i++) {
            BigInteger bd1 =new BigInteger(4,new Random());
            System.out.println(bd1);
        }*/

        BigInteger bd2 = new BigInteger("100");
        System.out.println(bd2);

        BigInteger bd3 = new BigInteger("a3A",16);
        System.out.println(bd3);

        BigInteger bd4 = BigInteger.valueOf(100L);
        System.out.println(bd4);


    }
}
