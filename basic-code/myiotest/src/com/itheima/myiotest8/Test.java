package com.itheima.myiotest8;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myiotest/src/com/itheima/myiotest8/userinfo.txt"));
        String line = br.readLine();
        br.close();
        String[] userInfo = line.split("&");
        String rightUsername = userInfo[0].split("=")[1];
        String rightPassword = userInfo[1].split("=")[1];
        int count = Integer.parseInt(userInfo[2].split("=")[1]);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();



        if(count<3){
            if (rightUsername.equals(username) && rightPassword.equals(password)) {
                System.out.println("登录成功");
                count =0;
            }
            else {
                if(count<2) {
                    System.out.println("登录失败，还剩下" + (2 - count) + "次机会");
                    count++;
                }
                else {
                    System.out.println("账户被锁定");
                }
            }
        }
        else {
            System.out.println("账户被锁定");
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest/src/com/itheima/myiotest8/userinfo.txt"));
        String  str = userInfo[0]+"&"+userInfo[1]+"&count="+count;
        bw.write(str);
        bw.close();
    }
}
