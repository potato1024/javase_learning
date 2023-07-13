package com.itheima.util;

import com.itheima.pojo.User;

import java.util.ArrayList;

public class CheckUtil {
    public static boolean check(ArrayList<User> list,String username, String password){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUsername().equals(username)){
                if(list.get(i).getPassword().equals(password)){
                    return true;
                }
            }
        }
        return  false;
    }
}
