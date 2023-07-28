package com.itheima.a03threadextra19;

import java.util.concurrent.Exchanger;

public class ExchangerDemo01 {

    public static void main(String[] args) {

        // 创建一个Exchanger对象
        Exchanger<String> exchanger = new Exchanger<String>() ;

        // 创建一个ManThread对象
        ManThread manThread = new ManThread(exchanger , "杨过") ;

        // 创建一个WomanThread对象
        WomanThread womanThread = new WomanThread(exchanger , "小龙女") ;

        // 启动线程
        manThread.start();
        womanThread.start();

    }

}