package com.itheima.myiotest9;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();

        p.put("aaa","bbb");
        p.put("bbb","bbb");
        p.put("ccc","bbb");
        p.put("ddd","bbb");


        FileOutputStream fos = new FileOutputStream("myiotest/a.properties");
        p.store(fos,"test");
        fos.close();
/*        BufferedWriter bw = new BufferedWriter(new FileWriter("myiotest/a.properties"));
        Set<Map.Entry<Object, Object>> entries = p.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            bw.write(key+" = "+value);
            bw.newLine();
        }
        bw.close();*/



    }
}
