package com.itheima.a04test;

public class Test3 {
    public static void main(String[] args) {
        /*

            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制

         */

        int num = 1055;
        String binaryString = toBinaryString(num);
        System.out.println(binaryString);
        System.out.println(Integer.toBinaryString(num));

    }

    private static String toBinaryString(int num) {
        StringBuilder str = new StringBuilder();
        while(num !=0){
            int yu = num % 2;
            str.insert(0,yu);
            num = num /2;

        }
        return str.toString();
    }

}
