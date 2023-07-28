package com.itheima.a03threadextra5;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorDemo01 {

    public static void main(String[] args) {

        /**
         * 核心线程数量为1 ， 最大线程池数量为3, 任务容器的容量为1 ,空闲线程的最大存在时间为20s
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1 , 3 , 20 , TimeUnit.SECONDS ,
                new ArrayBlockingQueue<>(1) , Executors.defaultThreadFactory() , new ThreadPoolExecutor.AbortPolicy()) ;

        // 提交3个任务，此时会产生一个核心线程,一个临时工线程，队列中会存在一个任务，20s后临时工线程被回收，核心线程不会被回收
        for(int x = 0 ; x < 3 ; x++) {
            threadPoolExecutor.submit(() -> {		// 断点位置
                System.out.println(Thread.currentThread().getName() + "---->> 执行了任务");
            });
        }

    }

}