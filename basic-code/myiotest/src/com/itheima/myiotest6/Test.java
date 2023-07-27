package com.itheima.myiotest6;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {


        for (int j = 0; j < 100000; j++) {
            File names = new File("myiotest/src/com/itheima/myiotest6/names.txt");
            File backup = new File("myiotest/src/com/itheima/myiotest6/backup.txt");

            int count = 0;
            if (!backup.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(names));
                while ((br.readLine()) != null) {
                    count++;
                }
                br.close();

                BufferedReader br2 = new BufferedReader(new FileReader(names));
                BufferedWriter bw = new BufferedWriter(new FileWriter(backup));


                for (int i = 0; i < count - 1; i++) {
                    bw.write(br2.readLine() + "+" + 1);
                    bw.newLine();
                }
                bw.write(br2.readLine() + "+" + 1);
                bw.close();
                br2.close();
            }

            TreeMap<String, Integer> map = new TreeMap<>();
            BufferedReader br = new BufferedReader(new FileReader(backup));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                count++;
                map.put(line.split("\\+")[0], Integer.parseInt(line.split("\\+")[1]));
            }
            br.close();
            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            boolean evenFlag = true;
            for (Map.Entry<String, Integer> entry : entries) {
                int value = entry.getValue();
                if (value == 1) {
                    evenFlag = false;
                    break;
                }
            }
            entries = map.entrySet();
            for (Map.Entry<String, Integer> entry : entries) {
                sum = sum + entry.getValue();
            }
            Random r = new Random();
            int index = r.nextInt(sum);
            int i = 0;
            int loopCount = 0;
            boolean flag = true;
            String s;
            BufferedWriter bw = new BufferedWriter(new FileWriter(backup));
            //1 2 4 4 总数为11 从0-10间随机，假设随机到6 index=6
            //0 12  3456 78910
            //落到第三段
            //第一次循环结束i=1，第二次循环结束i=1+2=3，第三次循环结束i=3+4=7
            for (Map.Entry<String, Integer> entry : entries) {

                s = entry.getKey();
                i = i + entry.getValue();
                if (i > index && flag) {
                    System.out.println(s);
                    flag = false;
                    if (!evenFlag) {
                        bw.write(entry.getKey() + "+" + entry.getValue());
                    } else {
                        bw.write(entry.getKey() + "+" + entry.getValue() / 2);
                    }
                } else {
                    if (!evenFlag) {
                        bw.write(entry.getKey() + "+" + (entry.getValue() * 2));
                    } else {
                        bw.write(entry.getKey() + "+" + entry.getValue());
                    }
                }

                loopCount++;
                if (loopCount == count) {
                    break;
                }
                bw.newLine();
            }
            bw.close();
        }


    }
}
