package com.itheima.test;

import java.io.*;
import java.util.TreeSet;

public class Test7 {
    public static void main(String[] args) throws IOException {
                    /*
                实现一个验证程序运行次数的小程序，要求如下：
                1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
                2.程序运行演示如下:
                    第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
                    第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
                    第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
                    第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~

           */
        System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
        File file = new File("myio/count.txt");
        if(!file.exists()){
            System.out.println("欢迎使用本软件,第1次使用免费~");
            FileWriter fw = new FileWriter(file);
            fw.write("1");
            fw.close();
        }
        else {
            BufferedReader br = new BufferedReader(new FileReader(file));
            int count = Integer.parseInt(br.readLine());
            br.close();

            if(count<=3){
                System.out.println("欢迎使用本软件,第"+count+"次使用免费~");
            }
            else System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");

            FileWriter fw = new FileWriter(file);
            fw.write(count+1+"");
            fw.close();

        }
    }
}
