package com.itheima.a03threadextra19;

import java.util.concurrent.Exchanger;

public class WomanThread extends Thread {

    // 定义Exchanger类型的变量
    private Exchanger<String> exchanger ;
    private String name ;
    public WomanThread(Exchanger<String> exchanger , String name) {
        super(name) ;
        this.name = name ;
        this.exchanger = exchanger ;
    }

    @Override
    public void run() {

        try {
            String result = exchanger.exchange("铝戒");
            System.out.println(name + "---->>把铝戒给老公");
            System.out.println(name + "---->>得到老公给的" + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}