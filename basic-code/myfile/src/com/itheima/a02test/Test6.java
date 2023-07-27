package com.itheima.a02test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Test6 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/potato/Desktop/aaa");
        HashMap<String, Integer> map = new HashMap<>();
        count(file, map);
        System.out.println(map);


    }


    public static void count(File dir, HashMap<String, Integer> map) {

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                String[] arr = file.getName().split("\\.");
                if (arr.length >= 2) {
                    String s = arr[arr.length - 1];
                    if (map.containsKey(s)) {
                        map.put(s, map.get(s) + 1);
                    } else {
                        map.put(s, 1);
                    }


                }


            } else {
                count(file, map);
            }
        }
    }
}
