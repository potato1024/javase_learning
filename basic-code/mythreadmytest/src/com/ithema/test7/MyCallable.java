package com.ithema.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;

public class MyCallable implements Callable {

    //{10,5,20,50,100,200,500,800,2,80,300,700}

    ArrayList<Integer> list;
    static HashMap<String, ArrayList<Integer>> map = new HashMap<>();

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        int max;
        ArrayList<Integer> threadList = new ArrayList<>();
        while (true) {
            synchronized (MyCallable.class) {
                String name = Thread.currentThread().getName();
                if (list.isEmpty()) {
                    int size = threadList.size();
                    int sum = getSum(threadList);
                     max = getMax(threadList);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < threadList.size(); i++) {
                        sb.append(threadList.get(i)).append(",");
                    }
                    System.out.println("在此次抽奖过程中，" + name + "总共产生了" + threadList.size() + "个奖项。");
                    System.out.println("分别为：" + sb.toString() + "总计额为" + sum + "元");


                    break;
                } else {
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    //System.out.println(getName()+" 又产生了一个 "+prize+" 元大奖");
                    threadList.add(prize);

                    // Thread.yield();
                }

            }
        }
        return max;
    }

    private int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum = sum + i;
        }
        return sum;
    }

    private int getMax(ArrayList<Integer> list) {
        int max = 0;
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;


    }
}
