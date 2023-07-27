package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionDemo6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
        Integer[] array = list.toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
    }
}