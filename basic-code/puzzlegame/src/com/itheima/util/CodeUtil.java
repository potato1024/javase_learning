package com.itheima.util;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {
    public static String getCode() {
        ArrayList<Character> chlist = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            chlist.add((char) ('a' + i));
            chlist.add((char) ('A' + i));

        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        int index = r.nextInt(5);
        for (int i = 0; i < 5; i++) {
            if (index == i) {
                sb.append(r.nextInt(10));
            } else {
                sb.append(chlist.get(r.nextInt(chlist.size())));
            }

        }
        return sb.toString();
    }

}
