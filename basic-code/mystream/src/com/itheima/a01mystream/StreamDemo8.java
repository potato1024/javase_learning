package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37", "谢广坤-41");

        list.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s+1));
    }
}
