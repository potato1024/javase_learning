package com.itheima.lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 6, 7, 5, 4, 8, 9, 10};
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                    return o1 - o2;
                }
        );
        System.out.println(Arrays.toString(arr));
    }
}
