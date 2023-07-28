package com.itheima.a03threadextra11;

public class TemperatureSensor {        // 温度传感器类

    private volatile int temperature ;  // 温度值

    private String type ;               // 传感器的类型

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}