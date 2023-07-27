package com.itheima.myiotest7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myiotest/src/com/itheima/myiotest7/userinfo.txt"));
        String line= br.readLine();
        br.close();
        String[] userInfo = line.split("&");
        String rightUsername = userInfo[0].split("=")[1];
        String rightPassword = userInfo[1].split("=")[1];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();


        if(rightUsername.equals(username)&&rightPassword.equals(password)){
            System.out.println("登录成功");
        }

        else{
            System.out.println("登录失败");
        }


    }
}
