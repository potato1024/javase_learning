package com.itheima.a01mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StreamDemo9 {
    public static void main(String[] args) {
       /*
            void forEach(Consumer action)           遍历
            long count()                            统计
            toArray()                               收集流中的数据，放到数组中
       */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

       // list.stream().forEach(s-> System.out.println(s));
        long count = list.stream().count();
        System.out.println(count);

        Object[] array = list.stream().toArray();
        System.out.println(Arrays.toString(array));

        String[] array1 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array1));


    }
}
