package com.itheima.a03threadextra19;

import java.util.concurrent.Exchanger;

public class ManThread extends Thread {

    // 定义Exchanger类型的变量
    private Exchanger<String> exchanger ;
    private String name ;
    public ManThread(Exchanger<String> exchanger , String name) {
        super(name);
        this.name = name ;
        this.exchanger = exchanger ;
    }

    @Override
    public void run() {

        try {
            String result = exchanger.exchange("钻戒");
            System.out.println(name + "---->>把钻戒给媳妇");
            System.out.println(name + "---->>得到媳妇给的" + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}