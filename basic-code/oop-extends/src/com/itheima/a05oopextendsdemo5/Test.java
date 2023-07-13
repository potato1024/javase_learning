package com.itheima.a05oopextendsdemo5;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Fu {
    String name = "Fu";
    String hobby = "喝茶";

}

class Zi extends Fu {
    String name = "Zi";
    String game = "吃鸡";

    public void show() {
        //如何打印Zi
        System.out.println(name);
        //如何打印Fu
        System.out.println(super.name);
        //如何打印喝茶
        System.out.println(hobby);
        //如何打印吃鸡
        System.out.println(game);
    }
}
