package com.itheima.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        ArrayList<LihuaCat> list1 = new ArrayList<>();
        ArrayList<PersianCat> list2 = new ArrayList<>();
        ArrayList<TeddyDog> list3 = new ArrayList<>();
        ArrayList<HuskyDog> list4 = new ArrayList<>();

        KeepPet(list1);
        KeepPet(list2);
        KeepPet(list3);
        KeepPet(list4);
    }

    public static void KeepPet(ArrayList<? extends Animal> list) {

    }
}
