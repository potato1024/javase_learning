package com.itheima.myiotest4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myiotest/names.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        BufferedReader br2 = new BufferedReader(new FileReader("myiotest/count.txt"));
        int count = Integer.parseInt(br2.readLine()) + 1;
        br2.close();
        if (count == 3) {
            System.out.println("张三");
        } else {
            Collections.shuffle(list);
            System.out.println(list.get(0).split("-")[0]);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest/count.txt"));
        bw.write(count + "");
        bw.close();
    }
}
