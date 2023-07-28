package com.itheima.a03threadextra20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.concurrent.Exchanger;

public class ExchangerUseDemo {

    public static void main(String[] args) {

        // 1. 创建Exchanger对象
        Exchanger<ArrayList<String>> exchanger = new Exchanger<ArrayList<String>>() ;

        // 2. 通过匿名内部类的方法创建两个线程对象
        new Thread(new Runnable() {

            @Override
            public void run() {


                try {

                    // 读取文件中的数据，然后将其存储到集合中
                    ArrayList<String> arrayList = new ArrayList<String>() ;
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("mythreadpool/salary/2017-salary.txt")) ;
                    String line = null ;
                    while((line = bufferedReader.readLine()) != null) {
                        arrayList.add(line) ;
                    }

                    // arrayList.add("90000") ;
                    // arrayList.set(0 , "90000") ;
                    arrayList.remove(0) ;

                    // 调用Exchanger中的exchange方法完成数据的交换
                    ArrayList<String> exchange = exchanger.exchange(arrayList);

                    // 先比对长度
                    if(arrayList.size() == exchange.size()) {

                        // 然后使用对方线程所传递过来的数据和自己线程所读取到的数据进行比对
                        for(int x = 0 ; x < arrayList.size() ; x++) {

                            // 本方数据
                            String benfangElement = arrayList.get(x);

                            // 对方数据
                            String duifangElement = exchange.get(x);

                            // 比对
                            if(!benfangElement.equals(duifangElement)) {
                                System.out.println("数据存在问题.....");
                            }

                        }

                    }else  {
                        System.out.println("数据存在问题.....");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }).start();

        // 线程2
        new Thread(new Runnable() {

            @Override
            public void run() {


                try {

                    // 读取文件中的数据，然后将其存储到集合中
                    ArrayList<String> arrayList = new ArrayList<String>() ;
                    BufferedReader bufferedReader = new BufferedReader(new FileReader("mythreadpool/salary/2017-salary.txt")) ;
                    String line = null ;
                    while((line = bufferedReader.readLine()) != null) {
                        arrayList.add(line) ;
                    }

                    // 调用Exchanger中的exchange方法完成数据的交换
                    ArrayList<String> exchange = exchanger.exchange(arrayList);

                    // 先比对长度
                    if(arrayList.size() == exchange.size()) {

                        // 然后使用对方线程所传递过来的数据和自己线程所读取到的数据进行比对
                        for(int x = 0 ; x < arrayList.size() ; x++) {

                            // 本方数据
                            String benfangElement = arrayList.get(x);

                            // 对方数据
                            String duifangElement = exchange.get(x);

                            // 比对
                            if(!benfangElement.equals(duifangElement)) {
                                System.out.println("数据存在问题.....");
                            }

                        }

                    }else  {
                        System.out.println("数据存在问题.....");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }).start();

    }

}