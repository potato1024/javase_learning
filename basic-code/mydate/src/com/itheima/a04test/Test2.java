package com.itheima.a04test;

public class Test2 {
    public static void main(String[] args) {
        /*
            自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
            字符串中只能是数字不能有其他字符最少一位，最多10位
           0不能开头
        */


        String str = "12345678";
        int num = paseInt(str);
        System.out.println(num);
        System.out.println(num+1);
    }

    private static int paseInt(String str) {
        String regex = "[1-9]\\d{0,9}";
        if(!str.matches(regex)){
            System.out.println("格式错误");
        }else {
            System.out.println("格式正确");
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int i1 = c - '0';
                num = num * 10 + i1;
            }
            return num;

        }
        return 0;
    }
}