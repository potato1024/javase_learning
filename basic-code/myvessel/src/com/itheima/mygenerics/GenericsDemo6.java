package com.itheima.mygenerics;

import java.util.ArrayList;

public class GenericsDemo6 {

    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        ArrayList<Student> list4 = new ArrayList<>();

        method(list1);
        method(list2);
        //method(list3);
        //method(list4);


    }

    public static void method(ArrayList<? super Fu> list){

    }
}


