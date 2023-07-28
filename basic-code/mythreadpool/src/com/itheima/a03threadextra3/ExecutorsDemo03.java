package com.itheima.a03threadextra3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo03 {

    // 演示newFixedThreadPool方法所获取到的线程池的特点
    public static void main(String[] args) {

        // 获取线程池对象,初始化一个具有固定数量线程的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(3);  // 在该线程池中存在3个线程

        // 提交任务
        for(int x = 0 ; x < 5 ; x++) {
            threadPool.submit( () -> {
                System.out.println(Thread.currentThread().getName() + "----->>>执行了任务" );
            });
        }

        // 关闭线程池
        threadPool.shutdown();
    }

}