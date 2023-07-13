package com.itheima.test;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User user1 = new User(1,"zhangsan","123456");
        User user2 = new User(2,"lisi","123456");
        User user3 = new User(3,"wangwu","123456");
        list.add(user1);
        list.add(user2);
        list.add(user3);

        int result = selectById(list, 3);
        System.out.println(result);
    }
    public static int selectById(List<User> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
}
