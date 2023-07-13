package com.itheima.a05interfacedemo5;

public class PingPangCoach extends Coach implements English{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("teach pingpang");
    }

    @Override
    public void speakEnglish() {
        System.out.println("speak english");
    }
}
