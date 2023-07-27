package com.ithema.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
            有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
            创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”
            随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
                             每次抽出一个奖项就打印一个(随机)
            	抽奖箱1 又产生了一个 10 元大奖
            	抽奖箱1 又产生了一个 100 元大奖
            	抽奖箱1 又产生了一个 200 元大奖
            	抽奖箱1 又产生了一个 800 元大奖
            	抽奖箱2 又产生了一个 700 元大奖
            	.....
        */

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
        MyCallable mc = new MyCallable(list);
        FutureTask ft1 = new FutureTask(mc);
        Thread t1 = new Thread(ft1, "抽奖箱1");

        FutureTask ft2 = new FutureTask(mc);
        Thread t2 = new Thread(ft2, "抽奖箱2");


        t1.start();
        t2.start();

        int result1 = (Integer)ft1.get();
        int result2 = (Integer)ft2.get();

        if(result1>result2){
            System.out.println("在此次抽奖过程中,抽奖箱1中产生了最大奖项,该奖项金额为"+result1+"元");
        }else {
            System.out.println("在此次抽奖过程中,抽奖箱2中产生了最大奖项,该奖项金额为"+result2+"元");
        }


    }
}
