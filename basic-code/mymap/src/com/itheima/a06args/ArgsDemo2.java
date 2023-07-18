package com.itheima.a06args;

public class ArgsDemo2 {
    public static void main(String[] args) {
        int sum = getSum(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sum);
    }
    public static int getSum(int...args){
        int sum = 0;
        for (int arg : args) {
            sum = sum +arg;
        }
        return sum;
    }
}
