package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDemo4 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");

        List<Student> collect = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(collect);
    }
}