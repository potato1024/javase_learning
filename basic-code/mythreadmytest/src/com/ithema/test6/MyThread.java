package com.ithema.test6;

import java.util.*;

public class MyThread extends Thread {

    //{10,5,20,50,100,200,500,800,2,80,300,700}

    ArrayList<Integer> list;
    static HashMap<String, ArrayList<Integer>> map= new HashMap<>();

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> threadList=new ArrayList<>();
        while (true) {
            synchronized (MyThread.class) {
                String name = getName();
                if (list.isEmpty()) {
                        int size = threadList.size();
                        int sum = getSum(threadList);
                        int max = getMax(threadList);
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < threadList.size(); i++) {
                            sb.append(threadList.get(i)).append(",");
                        }
                        System.out.println("在此次抽奖过程中，"+name+"总共产生了"+threadList.size()+"个奖项。");
                        System.out.println("分别为："+sb.toString()+"最高奖项为"+max+"元，总计额为"+sum+"元");


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
