package com.itheima.mygenerics;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){}

    public static<T>  void addAll(MyArrayList<T> list,T t1,T t2,T t3,T t4){

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

    }

    public static <E> void addAll2(MyArrayList<E> list,E...e){
        for (E e1 : e) {
            list.add(e1);
        }
    }

}
