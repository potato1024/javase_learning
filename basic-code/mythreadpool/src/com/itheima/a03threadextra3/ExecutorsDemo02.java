package com.itheima.a03threadextra3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsDemo02 {

    // 演示Executors中的newCachedThreadPool返回的线程池的特点
    public static void main(String[] args) throws InterruptedException {

        // 获取线程池对象
        ExecutorService threadPool = Executors.newCachedThreadPool();

        // 提交任务
        threadPool.submit(() -> {
            System.out.println( Thread.currentThread().getName() + "---执行了任务");
        });

        // 线程休眠2秒，主线程休眠2秒，此时之前提交的任务应该已经执行完毕
        TimeUnit.SECONDS.sleep(2);

        // 提交任务
        threadPool.submit(() -> {
            System.out.println( Thread.currentThread().getName() + "---执行了任务");
        });

        // 不使用线程池了，还可以将线程池关闭
        threadPool.shutdown();

    }

}