package com.itheima.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone phone1 =new Phone("xiaomi",1000);
        Phone phone2 =new Phone("apple",8000);
        Phone phone3 =new Phone("chuizi",2999);

        list.add(phone1);
        list.add(phone2);
        list.add(phone3);

        ArrayList<Phone> phoneInfo = getPhoneInfo(list);
        for (int i = 0; i < phoneInfo.size(); i++) {
            Phone phone = phoneInfo.get(i);
            System.out.println(phone.getBrand()+", "+phone.getPrice());
        }


    }


    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if(price<3000){
                list1.add(p);
            }
        }
        return list1;

    }

}
