package com.itheima.a08regexdemo;

public class RegexDemo {
    public static void main(String[] args) {
        String qq = "0337890";
        //System.out.println(checkQQ(qq));

        System.out.println(qq.matches("[1-9]\\d{5,19}"));

    }

    public static boolean checkQQ(String qq){
        int length = qq.length();
        if(length<6||length>20){
            return false;
        }
        if(qq.startsWith("0")){
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if(c>'9'||c<'0'){
                return false;
            }

        }
        return true;

    }
}
