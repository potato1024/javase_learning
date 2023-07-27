package com.itheima.myiotest5;

import cn.hutool.core.io.FileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myiotest/src/com/itheima/myiotest5/names.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("myiotest/src/com/itheima/myiotest5/backup.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }

        while ((line = br2.readLine()) != null) {
            list.remove(line);
        }
        br2.close();
        br.close();

        Collections.shuffle(list);
        String name = list.get(0);
        System.out.println(name.split("-")[0]);

        if (list.size() != 1) {
            BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest/src/com/itheima/myiotest5/backup.txt", true));
            bw.write(name);
            bw.newLine();
            bw.close();
        }else{
            BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest/src/com/itheima/myiotest5/backup.txt"));
            bw.close();
        }


    }
}
