package com.itheima.a03threadextra11;

import java.util.concurrent.TimeUnit;

public class GatherTemperatureRunnable implements Runnable {

    // 温度传感器
    private TemperatureSensor temperatureSensor ;
    public GatherTemperatureRunnable(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor ;
    }

    @Override
    public void run() {

        // 定义一个变量，表示环境初始温度
        int temperature = 23 ;

        // 不断进行数据采集
        while(true) {

            // 将采集到的数据设置给温度传感器
            System.out.println(Thread.currentThread().getName() + "-----采集到的数据为----->>> " + temperature);
            temperatureSensor.setTemperature(temperature);

            try {
                // 线程休眠2秒,模拟每隔两秒采集一次数据
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 环境温度改变
            temperature += 2 ;

        }

    }

}