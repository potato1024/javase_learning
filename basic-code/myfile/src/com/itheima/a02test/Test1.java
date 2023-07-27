package com.itheima.a02test;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("myfile/aaa");
        file.mkdirs();
        File file2 = new File(file,"a.txt");
        boolean b = file2.createNewFile();
        if(b){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
        }

    }
}
