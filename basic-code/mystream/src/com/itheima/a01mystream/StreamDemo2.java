package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        list.stream().forEach(s-> System.out.println(s));



    }
}
