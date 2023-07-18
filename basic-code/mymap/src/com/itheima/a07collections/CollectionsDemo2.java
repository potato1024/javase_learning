
package com.itheima.a07collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public CollectionsDemo2() {
    }

    public static void main(String[] args) {
        System.out.println("-------------sort默认规则--------------------------");
        ArrayList<Integer> list1 = new ArrayList();
        Collections.addAll(list1, new Integer[]{10, 1, 2, 4, 8, 5, 9, 6, 7, 3});
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("-------------sort自己指定规则规则--------------------------");
        Collections.sort(list1, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list1);
        Collections.sort(list1, (o1, o2) -> {
            return o2 - o1;
        });
        System.out.println(list1);
        System.out.println("-------------binarySearch--------------------------");
        ArrayList<Integer> list2 = new ArrayList();
        Collections.addAll(list2, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(Collections.binarySearch(list2, 9));
        System.out.println(Collections.binarySearch(list2, 1));
        System.out.println(Collections.binarySearch(list2, 20));
        System.out.println("-------------copy--------------------------");
        ArrayList<Integer> list3 = new ArrayList();
        ArrayList<Integer> list4 = new ArrayList();
        Collections.addAll(list3, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Collections.addAll(list4, new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        Collections.copy(list4, list3);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println("-------------fill--------------------------");
        ArrayList<Integer> list5 = new ArrayList();
        Collections.addAll(list5, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Collections.fill(list5, 100);
        System.out.println(list5);
        System.out.println("-------------max/min--------------------------");
        ArrayList<Integer> list6 = new ArrayList();
        Collections.addAll(list6, new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(Collections.max(list6));
        System.out.println(Collections.min(list6));
        System.out.println("-------------max/min指定规则--------------------------");
        ArrayList<String> list7 = new ArrayList();
        Collections.addAll(list7, new String[]{"a", "aa", "aaa", "aaaa"});
        System.out.println((String) Collections.max(list7, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        }));
        System.out.println("-------------swap--------------------------");
        ArrayList<Integer> list8 = new ArrayList();
        Collections.addAll(list8, new Integer[]{1, 2, 3});
        Collections.swap(list8, 0, 2);
        System.out.println(list8);
    }
}
