package com.itheima.search;

public class A05_BlockSearchDemo2 {
    public static void main(String[] args) {
        /*
            分块查找
            核心思想：
                块内无序，块间有序
            实现步骤：
                1.创建数组blockArr存放每一个块对象的信息
                2.先查找blockArr确定要查找的数据属于哪一块
                3.再单独遍历这一块数据即可
        */
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};

        Block2 b1 = new Block2(40, 22, 0, 4);
        Block2 b2 = new Block2(20, 13, 5, 8);
        Block2 b3 = new Block2(10, 7, 9, 10);
        Block2 b4 = new Block2(50, 43, 11, 13);


        Block2[] blockArr = {b1, b2, b3, b4};
        int number = 19;
        int index = getIndex(blockArr, arr, number);
        System.out.println(index);
    }

    private static int getIndex(Block2[] blockArr, int[] arr, int number) {

        int indexBlock = findIndexBlock(blockArr, number);
        if (indexBlock == -1) {
            return -1;
        }
        int start = blockArr[indexBlock].getStart();
        int end = blockArr[indexBlock].getEnd();
        for (int i = start; i <= end; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    private static int findIndexBlock(Block2[] blockArr, int num) {

        for (int i = 0; i < blockArr.length; i++) {
            if (num <= blockArr[i].getMax() && num >= blockArr[i].getMin()) {
                return i;
            }
        }
        return -1;
    }
}

