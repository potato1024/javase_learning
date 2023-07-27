package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}