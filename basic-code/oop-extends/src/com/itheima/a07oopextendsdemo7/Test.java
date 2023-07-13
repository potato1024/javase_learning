package com.itheima.a07oopextendsdemo7;

public class Test {
    public static void main(String[] args) {
        Husky husky = new Husky();
        SharPei sharPei = new SharPei();
        ChineseDog chineseDog = new ChineseDog();

        husky.eat();
        husky.drink();
        husky.lookHome();
        husky.breakHome();

        sharPei.eat();
        sharPei.drink();
        sharPei.lookHome();

        chineseDog.eat();
        chineseDog.drink();
        chineseDog.lookHome();
    }
}
