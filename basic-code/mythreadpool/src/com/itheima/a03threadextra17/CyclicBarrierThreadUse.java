package com.itheima.a03threadextra17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierThreadUse implements Runnable {

    // 当前我们两个线程到达了屏障点以后，我们需要立即对数据进行汇总, 因此我们需要使用第二个构造方法
    // 并且我们当前这个类就是一个任务类，因此我们可以直接传递参数this
    private CyclicBarrier cyclicBarrier = new CyclicBarrier(2 , this) ;
    private ConcurrentHashMap<Integer , String> concurrentHashMap = new ConcurrentHashMap<Integer , String>() ;  // 存储两个线程所读取的数据

    public void count() {

        // 定义一个方法count方法，在count方法中开启两个线程对象(可以使用匿名内部类的方式实现)
        // 线程1
        new Thread(new Runnable() {

            @Override
            public void run() {

                // 读取数据
                BufferedReader bufferedReader = null ;
                try {


                    bufferedReader = new BufferedReader(new FileReader("mythreadpool/salary/2017-salary.txt")) ;
                    String line = null ;
                    while((line = bufferedReader.readLine()) != null) {
                        concurrentHashMap.put(Integer.parseInt(line) , "") ;            // 小的问题，工资信息不能重复
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if(bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                // 模拟任务的执行时间
                try {
                    TimeUnit.SECONDS.sleep(5) ;
                    System.out.println(Thread.currentThread().getName() + "---------------------线程读取数据完毕....");
                    cyclicBarrier.await() ;         //通知cyclicBarrier当前线程已经到达了屏障点
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }

        }).start();

        // 线程2
        new Thread(new Runnable() {

            @Override
            public void run() {

                // 读取数据
                BufferedReader bufferedReader = null ;
                try {


                    bufferedReader = new BufferedReader(new FileReader("mythreadpool/salary/2019-salary.txt")) ;
                    String line = null ;
                    while((line = bufferedReader.readLine()) != null) {
                        concurrentHashMap.put(Integer.parseInt(line) , "") ;            // 小的问题，工资信息不能重复
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if(bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                // 模拟任务的执行时间
                try {
                    TimeUnit.SECONDS.sleep(10) ;
                    System.out.println(Thread.currentThread().getName() + "---------------------线程读取数据完毕....");
                    cyclicBarrier.await() ;         //通知cyclicBarrier当前线程已经到达了屏障点
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }

        }).start();


    }

    @Override
    public void run() {

        // 获取concurrentHashMap中的数据进行汇总
        Enumeration<Integer> enumeration = concurrentHashMap.keys();        // 获取concurrentHashMap中所有的键

        /**
         * 这个Enumeration的使用和我们之前所学习过的迭代器类似
         * boolean hasMoreElements(); 判断集合中是否存在下一个元素
         * E nextElement();           获取元素
         */
        int result = 0 ;
        while(enumeration.hasMoreElements()) {
            Integer integer = enumeration.nextElement();
            result += integer ;
        }

        // 输出
        System.out.println(result);

    }


}