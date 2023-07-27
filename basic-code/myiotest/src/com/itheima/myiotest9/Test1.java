package com.itheima.myiotest9;

import java.util.Properties;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Properties p = new Properties();

        p.put("aaa","bbb");
        p.put("bbb","bbb");
        p.put("ccc","bbb");
        p.put("ddd","bbb");

        //System.out.println(p);

        Set<Object> keys = p.keySet();
        for (Object key : keys) {
            System.out.println(key+" = "+p.get(key));
        }

    }
}
