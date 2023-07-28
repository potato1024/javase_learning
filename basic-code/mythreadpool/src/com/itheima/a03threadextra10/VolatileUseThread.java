package com.itheima.a03threadextra10;

public class VolatileUseThread implements Runnable {

    // 定义标志变量
    private volatile boolean shutdown = false ;

    @Override
    public void run() {

        while(!shutdown) {
            System.out.println("传智播客中国IT教育的标杆....");
        }

    }

    // 关闭线程
    public void shutdown() {
        this.shutdown = true ;
    }

}