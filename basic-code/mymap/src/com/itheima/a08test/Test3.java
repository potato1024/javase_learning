package com.itheima.a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        int count = 30;
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
        Collections.shuffle(list);
        Iterator<String> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (count > 0) {
                    String next = it.next();
                    System.out.println(next);
                    temp.add(next);
                    it.remove();
                    count--;
                } else break;
            } else {
                list.addAll(temp);
                temp.clear();
                Collections.shuffle(list);
                it = list.iterator();
                System.out.println("----------");
            }
        }


    }
}
