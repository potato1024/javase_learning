package com.itheima.arraysdemo;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraysDemo2 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,6,7,5,4,8,9,10};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("o1:"+o1);
                System.out.println("o2:"+o2);
                return o1-o2;
            }
        });
        System.out.println(Arrays.toString(arr));


    }
}
