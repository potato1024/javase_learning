package com.itheima.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);

        double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}
