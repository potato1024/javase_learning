package com.itheima.a01mystream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        //Arrays.stream(arr).forEach(n-> System.out.println(n));

        String[] arr2 = {"a","b","c"};
        //Arrays.stream(arr2).forEach(n-> System.out.println(n));

        Stream.of(arr2).forEach(s-> System.out.println(s));
        Stream.of(arr).forEach(s-> System.out.println(s));

    }
}
