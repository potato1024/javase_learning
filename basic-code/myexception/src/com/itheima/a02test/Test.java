package com.itheima.a02test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入姓名：");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("请输入年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                break;
            } catch (NumberFormatException | AgeOutOfBoundsException | NameFormatException e) {
                e.printStackTrace();
            }
        }
        System.out.println(gf);
    }
}
