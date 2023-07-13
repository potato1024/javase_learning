package com.itheima.search;

public class A03_BinarySearchDemo1 {
    public static void main(String[] args) {

        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}

        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int i = binarySearch(arr, 147);
        System.out.println(i);

    }

    public static int binarySearch(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        int mid;
        while (min <= max) {
            mid = (min + max) / 2;
            if (num == arr[mid]) {
                return mid;
            } else if (num < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }


        }
        return -1;
    }
}
