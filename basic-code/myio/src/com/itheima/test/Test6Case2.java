package com.itheima.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test6Case2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio/csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio/csb-sort.txt"));

        TreeSet<String> list = new TreeSet<>((o1, o2) -> Integer.parseInt(o1.split("\\.")[0])-Integer.parseInt(o2.split("\\.")[0]));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
