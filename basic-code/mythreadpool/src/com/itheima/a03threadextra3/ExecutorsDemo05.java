package com.itheima.a03threadextra3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorsDemo05 {

    // 演示：newSingleThreadScheduledExecutor方法所获取到的线程池的第一个特点(初始化一个具有一个线程的线程池)
    public static void main(String[] args) {

        // 获取线程池对象
        ScheduledExecutorService threadPool = Executors.newSingleThreadScheduledExecutor();

        // 提交任务
        for(int x = 0 ; x < 5 ; x++) {
            threadPool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "---->>执行了任务");
            });
        }

        // 关闭线程池
        threadPool.shutdown();
    }

}