package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //Stream<String> stream1 = list.stream().filter(s -> s.startsWith("张"));
        //Stream<String> stream2 = stream1.filter(s -> s.length() == 3);
        //stream2.forEach(s -> System.out.println(s));

        //Stream<String> stream3 = stream1.filter(s -> s.length() == 3);

        //list.stream().limit(3).forEach(s-> System.out.println(s));
        //list.stream().skip(4).forEach(s-> System.out.println(s));
        list.stream().limit(6).skip(3).forEach(s-> System.out.println(s));


    }
}
