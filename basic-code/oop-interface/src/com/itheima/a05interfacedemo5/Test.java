package com.itheima.a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        PingPangSporter pingPangSporter = new PingPangSporter("zhangsan", 23);
        System.out.println(pingPangSporter.getName()+", "+pingPangSporter.getAge());
        pingPangSporter.speakEnglish();
        pingPangSporter.study();


        BasketballCoach basketballCoach = new BasketballCoach("lisi", 24);
        System.out.println(basketballCoach.getName()+", "+basketballCoach.getAge());
        basketballCoach.teach();
    }
}
