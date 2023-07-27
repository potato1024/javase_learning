package com.itheima.myiotest2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myiotest/names.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while((line= br.readLine())!=null){
            list.add(line);
        }
        br.close();
        Collections.shuffle(list);
        System.out.println(list.get(0).split("-")[0]);
    }
}
