package com.itheima.a03threadextra9;

public class VolatileAtomicThread implements Runnable {

    // 定义一个int类型的变量
    //private int count = 0 ;
    private volatile int count = 0 ;

    @Override
    public void run() {
        
        // 对该变量进行++操作，100次
        for(int x = 0 ; x < 100 ; x++) {
            count++ ;					
            System.out.println("冰淇淋的个数 =========>>>> " + count);
        }
        
    }

}