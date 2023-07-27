package com.itheima.myiotest3;

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
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String gender = line.split("-")[1];
            if(gender.equals("男")){
                boyList.add(line);
            }
            else {
                girlList.add(line);
            }

        }
        br.close();

        ArrayList<Integer> numberList = new ArrayList<>();
        Collections.addAll(numberList, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2);
        int boyCount= 0;
        int girlCount = 0;
        for (int i = 0; i < 1000000; i++) {
            Collections.shuffle(numberList);
            if(numberList.get(0)==1){
                boyCount++;
                Collections.shuffle(boyList);
                System.out.println(boyList.get(0).split("-")[0]);
            }
            else {
                girlCount++;
                Collections.shuffle(girlList);
                System.out.println(girlList.get(0).split("-")[0]);
            }
        }

        System.out.println("男生被点次数："+boyCount);
        System.out.println("女生被点次数："+girlCount);





    }

}
