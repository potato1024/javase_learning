package com.itheima.a03threadextra3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsDemo06 {

    // 演示newSingleThreadScheduledExecutor方法所获取到的线程池的特点(支持定时及周期性任务执行)
    public static void main(String[] args) {

        // 获取线程池对象
        ScheduledExecutorService threadPool = Executors.newSingleThreadScheduledExecutor();

        // 提交任务,10s以后开始执行该任务
        threadPool.schedule( () -> {
            System.out.println(Thread.currentThread().getName() + "---->>>执行了该任务");
        } , 10 , TimeUnit.SECONDS) ;

        // 关闭线程池
        threadPool.shutdown();
    }

}