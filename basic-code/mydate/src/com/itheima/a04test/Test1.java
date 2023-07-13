package com.itheima.a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
            键盘录入一些1~10日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        */

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("请输入一个整数：");
            String s = sc.nextLine();
            int num = Integer.parseInt(s);
            if (num < 1 || num > 100) {
                System.out.println("1-100,重新输入：");
                continue;
            }
            list.add(num);
            int sum = getSum(list);
            if(sum>200){
                System.out.println("满足要求");
                break;
            }


        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+", ");
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0 ;
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            sum = sum +integer;
        }
        return sum;
    }

}
