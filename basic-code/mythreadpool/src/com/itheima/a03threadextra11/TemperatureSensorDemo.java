package com.itheima.a03threadextra11;

public class TemperatureSensorDemo {

    public static void main(String[] args) {

        // 创建TemperatureSensor对象
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // 创建ReadTemperatureRunnable类对象
        ReadTemperatureRunnable readTemperatureRunnable = new ReadTemperatureRunnable(temperatureSensor) ;

        // 创建GatherTemperatureRunnable类对象
        GatherTemperatureRunnable gatherTemperatureRunnable = new GatherTemperatureRunnable(temperatureSensor) ;

        // 创建2个Thread对象，并启动; 这两个线程负责读取TemperatureSensor中的温度数据
        for(int x = 0 ; x < 2 ; x++) {
            new Thread(readTemperatureRunnable).start();
        }

        // 创建1个Thread对象，并启动，这个线程负责读取定时采集数据中的温度数据
        Thread gatherThread = new Thread(gatherTemperatureRunnable);
        gatherThread.setName("温度采集线程");
        gatherThread.start();

    }

}