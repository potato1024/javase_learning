package com.itheima.a03threadextra17;

public class CyclicBarrierThreadUseDemo01 {

    public static void main(String[] args) {
		
        // 创建任务类的对象
        CyclicBarrierThreadUse cyclicBarrierThreadUse = new CyclicBarrierThreadUse();
        
        // 调用count方法进行数据汇总
        cyclicBarrierThreadUse.count();

    }

}