package com.itheima.a03threadextra10;

import java.util.concurrent.TimeUnit;

public class VolatileUseThreadDemo01 {

    public static void main(String[] args) throws InterruptedException {

        // 创建线程任务类对象
        VolatileUseThread volatileUseThread = new VolatileUseThread() ;

        // 创建线程对象
        Thread thread = new Thread(volatileUseThread);

        // 启动线程
        thread.start();

        // 主线程休眠
        TimeUnit.SECONDS.sleep(5);

        // 关闭线程
        volatileUseThread.shutdown();

    }

}