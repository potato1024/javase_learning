package com.itheima.test;

import java.util.concurrent.CountDownLatch;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(getSum(20));
    }

    public static  int getSum(int floor){
        if(floor==1){
            return 1;
        }
        if(floor==2){
            return 2;
        }
        if(floor==3){
            return 3;
        }
        return getSum(floor-1)+getSum(floor-2)+getSum(floor-3);
    }

}
