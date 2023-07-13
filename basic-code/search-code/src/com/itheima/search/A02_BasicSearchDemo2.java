package com.itheima.search;

import java.util.ArrayList;

public class A02_BasicSearchDemo2 {
    //基本查找/顺序查找
    //核心：
    //从0索引开始挨个往后查找

    //需求：定义一个方法利用基本查找，查询某个元素是否存在
    //数据如下：{131, 127, 147, 81, 103, 23, 7, 79}

    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 81};
        ArrayList<Integer> integers = basicSearch(arr, 82);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }

    }
    public static ArrayList<Integer> basicSearch(int[] arr, int num){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                list.add(i);
            }
        }
        return list;
    }
}
