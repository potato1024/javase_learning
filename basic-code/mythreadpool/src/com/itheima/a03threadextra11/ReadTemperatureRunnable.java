package com.itheima.a03threadextra11;

import java.util.concurrent.TimeUnit;

public class ReadTemperatureRunnable implements Runnable {

    // 温度传感器
    private TemperatureSensor temperatureSensor ;
    public ReadTemperatureRunnable(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor ;
    }

    @Override
    public void run() {

        // 不断的读取温度传感器中的数据
        while(true) {

            // 读取数据
            System.out.println(Thread.currentThread().getName() + "---读取到的温度数据为------>>> " + temperatureSensor.getTemperature());

            try {
                // 让线程休眠100毫秒，便于观察
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

}