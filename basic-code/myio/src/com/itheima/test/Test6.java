package com.itheima.test;

import java.io.*;
import java.util.*;

public class Test6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myio/csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("myio/csb-sort.txt"));

        ArrayList<String> list = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        list.sort((o1, o2) -> Integer.parseInt(o1.split("\\.")[0])-Integer.parseInt(o2.split("\\.")[0]));
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                bw.write(list.get(i));
            }
            else{
                bw.write(list.get(i));
                bw.newLine();
            }
        }
        bw.close();
        br.close();
    }
}
