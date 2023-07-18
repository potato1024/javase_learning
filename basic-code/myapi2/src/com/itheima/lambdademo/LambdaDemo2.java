package com.itheima.lambdademo;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {

        swim(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳");
            }
        });


        swim(() ->{
                System.out.println("正在游泳");
            }
        );
    }

    public static  void swim(Swim s){
        s.swimming();
    }
}
