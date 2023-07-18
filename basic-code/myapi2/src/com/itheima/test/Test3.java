package com.itheima.test;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

/*        int[] arr = new int[10];
        arr[9] = 1;
        for (int i = arr.length-2; i >=0; i--) {
            arr[i] = (arr[i+1]+1)*2;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);*/
        System.out.println(getSum(1));

    }

    private static int getSum(int day){
        if(day==10){
            return 1;
        }
        return (getSum(day+1)+1)*2;
    }


}
