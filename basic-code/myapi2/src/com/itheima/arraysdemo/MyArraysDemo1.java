package com.itheima.arraysdemo;

import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr,2));
        System.out.println(Arrays.binarySearch(arr,30));
        int[] ints = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(ints));
        int[] ints1 = Arrays.copyOfRange(arr, 0, 9);
        System.out.println(Arrays.toString(ints1));
        Arrays.fill(arr,100);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {1,2,3,6,7,5,4,8,9,10};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
