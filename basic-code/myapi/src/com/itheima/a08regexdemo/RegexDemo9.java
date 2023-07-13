package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) {
        String s = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是JAva8和JAVa11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久JAVA17也会逐渐登上历史舞台";

        String regex = "((?i)Java)(?=8|11|17)";
        String regex2 = "((?i)Java)(8|11|17)";
        String regex3 = "((?i)Java)(?:8|11|17)";
        String regex4 = "((?i)Java)(?!8|11|17)";




        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
