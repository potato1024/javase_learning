package com.itheima.a01oopextendsdemo1;

public class Test {
    public static void main(String[] args) {
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println("-----------------------");

        Husky hs = new Husky();
        hs.breakHome();
        hs.eat();
        hs.drink();
        hs.lookHome();
    }
}
