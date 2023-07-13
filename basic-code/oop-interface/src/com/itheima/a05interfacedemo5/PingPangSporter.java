package com.itheima.a05interfacedemo5;

public class PingPangSporter extends Sporter implements English{

    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("speak english");
    }

    @Override
    public void study() {
        System.out.println("study pingpang");
    }
}
