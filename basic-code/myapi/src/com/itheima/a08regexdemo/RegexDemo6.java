package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {

    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //Pattern;
        //Matcher;

        //method1(str);
        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }

    }

}