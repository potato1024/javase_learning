package com.itheima.a01myfunction;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
        //list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);
        StringOperation stringOperation = new StringOperation();

        list.stream().filter(stringOperation::stringJudge).forEach(System.out::println);
    }


    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
