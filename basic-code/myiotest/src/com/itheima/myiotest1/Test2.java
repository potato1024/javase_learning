package com.itheima.myiotest1;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) throws IOException {
        /*
         制造假数据：
             获取姓氏：https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0
             获取男生名字：http://www.haoming8.cn/baobao/10881.html
             获取女生名字：http://www.haoming8.cn/baobao/7641.html
        */

        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg0";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7641.html";

        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //System.out.println(familyNameStr);
        //System.out.println(boyNameNet);
        //System.out.println(girlNameNet);

        List<String> familyNameTempList = ReUtil.findAll( ".{4}(?=，|。)",familyNameStr, 0);
        List<String> boyNameTempList = ReUtil.findAll("[\\u4E00-\\u9FA5]{2}(?=、|。)",boyNameStr, 0);
        List<String> girlNameTempList = ReUtil.findAll("(.. ){4}..",girlNameStr,  0);

        //System.out.println(familyNameTempList);
        //System.out.println(boyNameTempList);
        //System.out.println(girlNameTempList);

        ArrayList<String> familyNameList = new ArrayList<>();
        for (String s : familyNameTempList) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                familyNameList.add(c + "");
            }
        }


        ArrayList<String> boyNameList = new ArrayList<>();
        for (String s : boyNameTempList) {
            if (!boyNameList.contains(s)) {
                boyNameList.add(s);
            }
        }

        ArrayList<String> girlNameList = new ArrayList<>();
        for (String s : girlNameTempList) {
            String[] arr = s.split(" ");
            for (String s1 : arr) {
                girlNameList.add(s1);
            }
        }

        //System.out.println(familyNameList);
        //System.out.println(boyNameList);
        //System.out.println(girlNameList);

        ArrayList<String> list = getInfos(familyNameList, boyNameList, girlNameList, 50, 30);
        System.out.println(list);

        FileUtil.writeLines(list,"names.txt","UTF-8");


    }

    public static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList,
                                             ArrayList<String> girlNameList, int boyCount, int girlCount) {
        HashSet<String> boySet = new HashSet<>();
        HashSet<String> girlSet = new HashSet<>();

        while (true) {
            if (boySet.size() == boyCount) {
                break;
            } else {
                Collections.shuffle(familyNameList);
                Collections.shuffle(boyNameList);
                boySet.add(familyNameList.get(0) + boyNameList.get(0));
            }
        }

        while (true) {
            if (girlSet.size() == girlCount) {
                break;
            } else {
                Collections.shuffle(familyNameList);
                Collections.shuffle(girlNameList);
                girlSet.add(familyNameList.get(0) + girlNameList.get(0));
            }
        }

        //System.out.println(boySet);
        //System.out.println(girlSet);
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (String s : boySet) {
            int age = r.nextInt(10) + 18;
            list.add(s + "-男-" + age);
        }
        for (String s : girlSet) {
            int age = r.nextInt(10) + 18;
            list.add(s + "-女-" + age);
        }
        Collections.shuffle(list);

        return list;

    }

}
