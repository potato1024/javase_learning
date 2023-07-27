package com.itheima.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("myio/a.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char) ch);
        }
        fr.close();
        //System.out.println(sb);

        Integer[] array = Arrays.stream(sb.toString()
                        .split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        String s = Arrays.toString(array).replace(", ", "-");
        String ss = s.substring(1, s.length() - 1);
        FileWriter fw = new FileWriter("myio/b.txt");
        fw.write(ss);
        fw.close();


    }
}
