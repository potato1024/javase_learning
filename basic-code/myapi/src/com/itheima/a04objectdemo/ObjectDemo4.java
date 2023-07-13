package com.itheima.a04objectdemo;

import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {

        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1,"zhangsan","123","girl11",data);

        User u2 = (User)u1.clone();

        //System.out.println(u1);
        //System.out.println(u2);

        Gson gson = new Gson();
        String s = gson.toJson(u1);
        User user = gson.fromJson(s, User.class);


        int[] data1 = u1.getData();
        data1[0]=100;

        System.out.println(user);


    }
}
